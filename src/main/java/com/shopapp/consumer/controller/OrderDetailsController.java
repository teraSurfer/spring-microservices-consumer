package com.shopapp.consumer.controller;

import com.shopapp.consumer.beans.ProductListVO;
import com.shopapp.consumer.client.Order;
import com.shopapp.consumer.client.OrderClient;
import com.shopapp.consumer.client.OrderResponse;
import com.shopapp.consumer.client.Product;
import com.shopapp.consumer.client.ProductClient;
import com.shopapp.consumer.client.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequestMapping("/order-details")
@RestController
public class OrderDetailsController {

    @Autowired
    private OrderClient orderClient;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/{id}")
    ResponseEntity<?> getOrderDetails(@PathVariable("id") long id) {
        OrderResponse orderResponse = orderClient.getOrder(id).getBody();
        Order order = orderResponse.getOrder();
        ProductListVO productListVO = new ProductListVO();
        productListVO.setProductIds(order.getOrderItems().stream().map(orderItem ->
           orderItem.getProductId()).collect(Collectors.toList()));
        ProductResponse productResponse = productClient.getProductList(productListVO).getBody();
        List<Product> products = productResponse.getProducts();
        Map<String, Object> response = new HashMap<>();
        response.put("products", products);
        response.put("order", order);
        response.put("message", "success");
        return ResponseEntity.ok(response);
    }

}
