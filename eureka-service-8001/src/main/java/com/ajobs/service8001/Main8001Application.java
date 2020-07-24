package com.ajobs.service8001;


import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
// @EnableChoerodonResourceServer 用于开启资源认证、关闭 Security 安全认证
@EnableChoerodonResourceServer
public class Main8001Application implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(Main8001Application.class, args);
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
    }
}


