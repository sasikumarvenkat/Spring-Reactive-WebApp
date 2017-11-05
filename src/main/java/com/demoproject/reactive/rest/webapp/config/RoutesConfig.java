package com.demoproject.reactive.rest.webapp.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import com.demoproject.reactive.rest.webapp.handler.SampleHandler;

/**
 * Contains the routes configuration settings required for exposing the REST
 * urls
 * 
 * @author sasi
 *
 */
@Configuration
public class RoutesConfig {

	@Autowired
	SampleHandler sampleHandler;

	@Autowired
	public RoutesConfig(SampleHandler sampleHandler) {
		this.sampleHandler = sampleHandler;
	}

	@Bean
	public RouterFunction<?> routerFunction() {
		return route(GET("/api/hello/health_checkup"), sampleHandler::healthCheckUp);

	}
}
