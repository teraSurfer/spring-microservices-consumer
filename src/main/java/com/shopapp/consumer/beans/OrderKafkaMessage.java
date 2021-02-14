package com.shopapp.consumer.beans;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class OrderKafkaMessage implements Serializable {
    private static final long serialVersionUID = 4644369997331828234L;
    String message;
}
