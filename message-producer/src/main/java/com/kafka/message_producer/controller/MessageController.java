package com.kafka.message_producer.controller;

import com.kafka.message_producer.service.MessageService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService)
    {
        this.messageService=messageService;

    }

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int range=10;
        while (range>0)
        {
            String message=Math.random() + " , " + Math.random();
            messageService.updateLocation(message);
            Thread.sleep(3000);
            range--;
        }

        return new ResponseEntity<> (Map.of("message","Location updated"), HttpStatus.OK);
    }
}
