package com.shopapp.consumer.controller;

import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HealthCheckControllerImpl implements HealthCheckController {

    @Qualifier("eurekaClient")
    @Autowired
    @Lazy
    private EurekaClient discoveryClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public ResponseEntity<?> handleHealthCheck() {
        log.info(discoveryClient.getApplication(appName).getName());
        Map<String, String> response = new HashMap<>();
        response.put("message", "ok");
        return ResponseEntity.ok(response);
    }
}
