package com.academia.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutes {

	@Bean
	public RouteLocator rotas(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("ALUNO-SERVICE", r -> r.path("/alunos/**")
				.filters(f -> f.circuitBreaker(c -> c
					.setName("alunoCB")
					.setFallbackUri("forward:/fallback/alunos")))
				.uri("lb://ALUNO-SERVICE"))

			.route("PLANO-SERVICE", r -> r.path("/planos/**")
				.filters(f -> f.circuitBreaker(c -> c
					.setName("planoCB")
					.setFallbackUri("forward:/fallback/planos")))
				.uri("lb://PLANO-SERVICE"))
			.build();
	}
}
