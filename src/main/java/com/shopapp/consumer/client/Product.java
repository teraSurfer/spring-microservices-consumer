package com.shopapp.consumer.client;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Product {
    private long id;
    private String productName;
    private String description;
    private double listPrice;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
