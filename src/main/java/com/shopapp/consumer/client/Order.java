package com.shopapp.consumer.client;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class Order implements Serializable {
    private static final long serialVersionUID = 699146421709002351L;

    long id;
    double totalPrice;
    String status;
    String shippingAddress;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private List<OrderItem> orderItems;
}
