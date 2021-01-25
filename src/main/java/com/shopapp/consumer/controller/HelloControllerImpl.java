package com.shopapp.consumer.controller;

import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloControllerImpl implements HelloController {

    @Qualifier("eurekaClient")
    @Autowired
    @Lazy
    private EurekaClient discoveryClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String sayHello() {
        log.info(discoveryClient.getApplication(appName).getName());
        return "Hello!";
    }
}
