package com.arun.kafka.consumer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafKaConsumerService {

    @KafkaListener(topics = "High_Topic",
            groupId = "g1")
    public void consumeHigh_Topic(String message)
    {
        log.info(String.format("Message recieved -> %s", message));
    }

    @KafkaListener(topics = "Medium_Topic",
            groupId = "g1")
    public void consumeMedium_Topic(String message)
    {
        log.info(String.format("Message recieved  -> %s", message));
    }

    @KafkaListener(topics = "Low_Topic",
            groupId = "g1")
    public void consumeLow_Topic(String message)
    {
        log.info(String.format("Message recieved -> %s", message));
    }
}
