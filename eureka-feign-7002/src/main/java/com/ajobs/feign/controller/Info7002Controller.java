package com.ajobs.feign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
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



/**
 * fallback： Fallback class for the specified Feign client interface. The fallback class must
 * implement the interface annotated by this annotation and be a valid spring bean.
 *
 */
@FeignClient(value = "service", fallback = ServiceImpl.class)
interface Service {
    @GetMapping(value = "/port")
    String getServicePort();
}


@Component
class ServiceImpl implements Service {
    @Override
    public String getServicePort() {
        return "error service!!!";
    }
}