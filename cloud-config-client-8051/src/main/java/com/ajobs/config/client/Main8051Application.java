package com.ajobs.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Main8051Application {

    public static void main(String[] args) {
        SpringApplication.run(Main8051Application.class, args);
    }


    //此处的意思就是，当注入数据的时候 a.b.d 不存在的时候就是用 hello，类似于三元运算符
    @Value("${wjx:hello}")
    private String defaultZone;

    @GetMapping("/dz")
    public String defaultZone(){
        return defaultZone;
    }
}
