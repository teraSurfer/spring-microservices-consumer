package com.shopapp.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product-service")
public interface ProductClient {
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, headers = "Content-Type=application/json")
    ResponseEntity<ProductResponse> getProduct(@PathVariable("id") long id);
}
