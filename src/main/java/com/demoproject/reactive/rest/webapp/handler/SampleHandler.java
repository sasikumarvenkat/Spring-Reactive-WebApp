package com.demoproject.reactive.rest.webapp.handler;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * A Handler class to handle and process the web requests.
 * 
 * @author sasi
 *
 */
@Component
public class SampleHandler {

	/**
	 * Returns the health checkup
	 * 
	 * @return {@link ServerResponse}
	 */
	public Mono<ServerResponse> healthCheckUp(ServerRequest request) {
		return ServerResponse.ok().contentType(APPLICATION_JSON)
				.body(fromObject(new String("Sample Service -->Up")));
	}
}
