package com.shopapp.consumer.controller;

import com.shopapp.consumer.beans.ProductListVO;
import com.shopapp.consumer.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductControllerImpl implements ProductController{

    @Autowired
    private ProductClient productClient;

    @Override
    public ResponseEntity<?> getProduct(@PathVariable("id") long id) {
        log.info(String.valueOf(id));
        return productClient.getProduct(id);
    }

    @Override
    public ResponseEntity<?> getProductList(@RequestBody ProductListVO productListVO) {
        return productClient.getProductList(productListVO);
    }

}
