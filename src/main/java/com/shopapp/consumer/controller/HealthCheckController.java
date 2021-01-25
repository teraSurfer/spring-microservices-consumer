package com.shopapp.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public interface HealthCheckController {
    @GetMapping("")
    ResponseEntity<?> handleHealthCheck();
}
