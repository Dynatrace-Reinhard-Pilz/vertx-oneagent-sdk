package io.vertx.starter;

import java.util.Objects;

import com.dynatrace.oneagent.sdk.OneAgentSDKFactory;
import com.dynatrace.oneagent.sdk.api.InProcessLink;
import com.dynatrace.oneagent.sdk.api.InProcessLinkTracer;
import com.dynatrace.oneagent.sdk.api.OneAgentSDK;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientRequest;

public final class Tagging<T> implements Handler<T> {
	
	public static <X> Handler<X> wrap(Handler<X> handler) {
		Objects.requireNonNull(handler);
		if (handler instanceof Tagging) {
			return handler;
		}
		return new Tagging<X>(handler, SDK.createInProcessLink());
	}
	
	@Override
	public void handle(T event) {
		InProcessLinkTracer tracer = SDK.traceInProcessLink(link);
		tracer.start();
		try {
			handler.handle(event);
		} catch (RuntimeException | Error e) {
			tracer.error(e);
			throw e;
		} catch (Exception e) {
			tracer.error(e);
		} finally {
			tracer.end();
		}
	}
	
	public static HttpClientRequest wrap(HttpClientRequest request) {
		Objects.requireNonNull(request);
		if (request instanceof HttpClientRequestWrapper) {
			return request;
		}
		return new HttpClientRequestWrapper(request);		
	}
	
	public static HttpClient wrap(HttpClient client) {
		Objects.requireNonNull(client);
		if (client instanceof HttpClientWrapper) {
			return client;
		}
		return new HttpClientWrapper(client);		
	}

	
	
	
	public static OneAgentSDK SDK = createSdk();
	
	private final Handler<T> handler;
	private final InProcessLink link;
	
	private Tagging(Handler<T> handler, InProcessLink link) {
		Objects.requireNonNull(handler);
		Objects.requireNonNull(link);
		this.handler = handler;
		this.link = link;
	}
	
	private static OneAgentSDK createSdk() {
		OneAgentSDK oneAgentSdk = OneAgentSDKFactory.createInstance();
		switch (oneAgentSdk.getCurrentState()) {
		case ACTIVE:
		  break;
		case PERMANENTLY_INACTIVE:
		  break;
		case TEMPORARILY_INACTIVE:
		  break;
		default:
		  break;
		}
		return oneAgentSdk;
	}
	
}
