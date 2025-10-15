package com.kafka.message_producer.service;

import com.kafka.message_producer.constant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public MessageService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean updateLocation(String message) {
        kafkaTemplate.send(AppConstant.LOCATION, message);
        return true;
    }
}
