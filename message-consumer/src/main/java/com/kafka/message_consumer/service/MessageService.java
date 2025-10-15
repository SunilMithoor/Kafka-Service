package com.kafka.message_consumer.service;

import com.kafka.message_consumer.constant.AppConstant;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @KafkaListener(topics = AppConstant.LOCATION,groupId = AppConstant.MESSAGE_GROUP)
    public void updateMessage(String message)
    {
        System.out.println("Consumer message-->" +message);
    }
}
