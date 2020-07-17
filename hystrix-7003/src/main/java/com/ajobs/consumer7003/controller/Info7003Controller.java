package com.ajobs.consumer7003.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Info7003Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/gsp")
    @HystrixCommand(fallbackMethod = "getServicePortHystrix")
    public String getServicePort() {
        return restTemplate.getForObject("http://service/port", String.class);

    }


    public String getServicePortHystrix(){
        return "error service!!!";
    }


}
