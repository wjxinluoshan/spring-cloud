package com.ajobs.feign;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Main7002Application {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main7002Application.class, args);
    }
}
