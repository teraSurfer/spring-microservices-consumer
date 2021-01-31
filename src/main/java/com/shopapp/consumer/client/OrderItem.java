package com.shopapp.consumer.client;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderItem implements Serializable {
    private static final long serialVersionUID = -26056726773945446L;

    private long productId;
    private int productCount;
}
