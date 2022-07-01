package com.ctech.apigateway;

import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {

   /* @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        predicateSpec ->
                                predicateSpec
                                        .path("/customer/**")
                                        .uri("lb://CUSTOMER")

                ).build();
    }*/
}
