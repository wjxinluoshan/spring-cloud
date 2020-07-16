package com.ajobs.server9090;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Main8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Main8001Application.class, args);
    }
}
