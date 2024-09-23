package com.leejk.kafkaproducertester.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProducerService {

    private final KafkaTemplate kafkaTemplate;

    @Value("#{'${topics}'.split(',')}")
    private String[] topics;

    public void produce1(String message) {
        log.info("{}으로 데이터 전송", topics[0]);
        kafkaTemplate.send(topics[0], message);
    }

    public void produce2(String message) {
        log.info("{}으로 데이터 전송", topics[1]);
        kafkaTemplate.send(topics[1], message + "but topic2");
    }


}
