package com.shopapp.consumer.kafkaproducer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KafkaMessage {
    private final String id;

    private final String message;

    @JsonCreator
    public KafkaMessage(@JsonProperty("id") String id,
                        @JsonProperty("message") String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "SampleMessage{id=" + this.id + ", message='" + this.message + "'}";
    }
}
