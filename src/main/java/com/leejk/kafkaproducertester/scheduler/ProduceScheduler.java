package com.leejk.kafkaproducertester.scheduler;

import com.leejk.kafkaproducertester.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProduceScheduler {

    private final ProducerService producerService;

    @Scheduled(fixedDelay = 5000)
    public void produce() {
        producerService.produce1("Hello: "+System.currentTimeMillis());
    }

}
