package com.shopapp.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order-service")
public interface OrderClient {
    @GetMapping(value = "/orders/{id}", headers = "Content-Type=application/json")
    ResponseEntity<OrderResponse> getOrder(@PathVariable("id") long id);
}
