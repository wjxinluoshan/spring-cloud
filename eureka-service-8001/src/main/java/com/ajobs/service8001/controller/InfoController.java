package com.ajobs.service8001.controller;


import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
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
