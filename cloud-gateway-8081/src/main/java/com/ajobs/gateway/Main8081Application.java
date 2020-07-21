package com.ajobs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author 28107 2020/07/21 11:04
 */
@SpringBootApplication
@RestController
public class Main8081Application {

    public static void main(String[] args) {
        SpringApplication.run(Main8081Application.class, args);
    }


    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        predicateSpec -> predicateSpec
                                .path("/hi")
                                .filters(gatewayFilterSpec -> gatewayFilterSpec.hystrix(
                                        config -> config.setFallbackUri("forward:/hi")))
                                .uri("http://localhost:8080")
                )
                .build();
    }


    @GetMapping("/hi")
    public String hi() {
        return "hi ,wrong";
    }

}
