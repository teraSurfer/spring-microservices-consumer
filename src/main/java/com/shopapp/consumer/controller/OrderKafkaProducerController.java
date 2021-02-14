package com.shopapp.consumer.controller;


import com.shopapp.consumer.beans.OrderKafkaMessage;
import com.shopapp.consumer.kafkaproducer.KafkaMessage;
import com.shopapp.consumer.kafkaproducer.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/order-kafka")
@Slf4j
public class OrderKafkaProducerController {

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("")
    public ResponseEntity<?> sendMessage(@RequestBody OrderKafkaMessage orderKafkaMessage) {
        log.info(orderKafkaMessage.getMessage());
        kafkaProducer.send(new KafkaMessage(UUID.randomUUID().toString(), orderKafkaMessage.getMessage()));
        Map<String, String> response = new HashMap<>();
        response.put("message", "success");
        return ResponseEntity.ok(response);
    }

}
