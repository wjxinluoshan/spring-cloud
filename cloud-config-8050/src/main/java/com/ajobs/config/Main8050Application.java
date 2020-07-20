package com.ajobs.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
/**
 * <p>
 *
 * </p>
 *
 * @author 28107 2020/07/20 9:35
 */
public class Main8050Application {

    public static void main(String[] args) {
        SpringApplication.run(Main8050Application.class, args);
    }
}
