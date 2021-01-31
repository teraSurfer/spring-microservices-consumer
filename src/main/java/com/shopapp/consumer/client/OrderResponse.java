package com.shopapp.consumer.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Order order;
    private List<Order> orders;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;
}
