package com.ajobs.feign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Info7002Controller {

    @Autowired
    private Service service;

    @GetMapping("/gsp")
    public String getServicePort() {
        return service.getServicePort();
    }
}


@FeignClient(value = "service")
interface Service {
    @GetMapping(value = "/port")
    String getServicePort();
}
