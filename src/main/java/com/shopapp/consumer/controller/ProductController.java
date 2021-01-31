package com.shopapp.consumer.controller;

import com.shopapp.consumer.beans.ProductListVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
public interface ProductController {
    @GetMapping("/{id}")
    ResponseEntity<?> getProduct(@PathVariable("id") long id);

    @PostMapping("/product-list")
    ResponseEntity<?> getProductList(@RequestBody ProductListVO productListVO);
}
