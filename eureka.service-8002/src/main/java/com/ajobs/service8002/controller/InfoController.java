package com.ajobs.service8002.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort() {
        return "service:" + port;
    }
}
