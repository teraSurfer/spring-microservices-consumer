package com.shopapp.consumer.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private Product product;
    private String message;
    private String status;
    private String error;
}
