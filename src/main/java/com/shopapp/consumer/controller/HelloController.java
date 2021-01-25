package com.shopapp.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public interface HelloController {
    @GetMapping("")
    String sayHello();
}
