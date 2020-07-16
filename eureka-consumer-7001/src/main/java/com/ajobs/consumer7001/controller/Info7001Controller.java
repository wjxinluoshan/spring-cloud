package com.ajobs.consumer7001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Info7001Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/gsp/{serviceName}")
    public String getServicePort(@PathVariable String serviceName) {
        return restTemplate.getForObject("http://" + serviceName + "/port", String.class);

    }
}