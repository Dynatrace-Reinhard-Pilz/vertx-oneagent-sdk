package io.vertx.starter;

import java.util.Objects;
import java.util.function.Function;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.http.WebSocket;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.streams.ReadStream;

public class HttpClientWrapper implements HttpClient {
	
	private HttpClient client = null;
	
	public HttpClientWrapper(HttpClient client) {
		Objects.requireNonNull(client);
		
		this.client = client;
	}

	@Override
	@Deprecated
	public HttpClientRequest get(String requestURI, Handler<HttpClientResponse> responseHandler) {
		return Tagging.wrap(client.get(requestURI, Tagging.wrap(responseHandler)));
	}

	@Override
	public HttpClientRequest request(HttpMethod method, RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, RequestOptions options,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest request(HttpMethod method, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI,	Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest get(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest getAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest getAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient getNow(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient getNow(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient getNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient getNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest post(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest postAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest postAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest head(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest headAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest headAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient headNow(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient headNow(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient headNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient headNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest options(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest optionsAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest optionsAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient optionsNow(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient optionsNow(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient optionsNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient optionsNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest put(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest putAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest putAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(RequestOptions options, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(int port, String host, String requestURI,
			Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest delete(String requestURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest deleteAbs(String absoluteURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClientRequest deleteAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, WebsocketVersion version, String subProtocols,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version,
			String subProtocols, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocketAbs(String url, MultiMap headers, WebsocketVersion version, String subProtocols,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(RequestOptions options, MultiMap headers, WebsocketVersion version, String subProtocols,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version,
			String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version,
			String subProtocols, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version,
			String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect,
			Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols,
			Handler<WebSocket> wsConnect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols,
			Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(RequestOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(int port, String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String host, String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(RequestOptions options, MultiMap headers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(int port, String host, String requestURI, MultiMap headers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String host, String requestURI, MultiMap headers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(RequestOptions options, MultiMap headers, WebsocketVersion version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(int port, String host, String requestURI, MultiMap headers,
			WebsocketVersion version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String host, String requestURI, MultiMap headers,
			WebsocketVersion version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStreamAbs(String url, MultiMap headers, WebsocketVersion version,
			String subProtocols) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(RequestOptions options, MultiMap headers, WebsocketVersion version,
			String subProtocols) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(int port, String host, String requestURI, MultiMap headers,
			WebsocketVersion version, String subProtocols) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String host, String requestURI, MultiMap headers,
			WebsocketVersion version, String subProtocols) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String requestURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String requestURI, MultiMap headers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String requestURI, MultiMap headers, WebsocketVersion version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadStream<WebSocket> websocketStream(String requestURI, MultiMap headers, WebsocketVersion version,
			String subProtocols) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient connectionHandler(Handler<HttpConnection> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpClient redirectHandler(Function<HttpClientResponse, Future<HttpClientRequest>> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<HttpClientResponse, Future<HttpClientRequest>> redirectHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
