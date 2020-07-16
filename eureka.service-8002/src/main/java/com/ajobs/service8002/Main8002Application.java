package com.ajobs.service8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Main8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Main8002Application.class, args);
    }
}