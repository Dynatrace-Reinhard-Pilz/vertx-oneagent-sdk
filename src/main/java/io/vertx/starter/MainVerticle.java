package io.vertx.starter;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpServer;

public class MainVerticle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Database.init();
		final Vertx vertx = Vertx.factory.vertx();		
		final HttpClient client = Tagging.wrap(vertx.createHttpClient());
		HttpServer httpServer = vertx.createHttpServer();			
		
		httpServer = httpServer.requestHandler(request -> {
			Database.accessDB("SELECT * FROM request_handler_data");

			request.response().bodyEndHandler(
				Tagging.wrap(
				event -> {
					Database.accessDB("SELECT * FROM body_handler_data");

					client.get("https://www.google.at/").handler(response -> Database.accessDB("SELECT * FROM request_handler_outgoing")).end();
				}
					
			)).end("Hello Vert.x!");			
		});
		
		
		httpServer = httpServer.listen(8080);
	}

}
