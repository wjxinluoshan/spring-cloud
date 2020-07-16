package com.ajobs.server9090;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Main9090Application {
    public static void main(String[] args) {
        SpringApplication.run(Main9090Application.class, args);
    }
}
