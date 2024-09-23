//package com.leejk.kafkaproducertester.controller;
//
//import com.leejk.kafkaproducertester.service.ProducerService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@Slf4j
//@RequiredArgsConstructor
//@RestController
//public class ProducerController {
//
//    private final ProducerService producerService;
//
//    @GetMapping("/send1")
//    public String send1(@RequestParam String message) {
//        producerService.produce1(message);
//        return "ok";
//    }
//
//    @GetMapping("/send2")
//    public String send2(@RequestParam String message) {
//        producerService.produce2(message);
//        return "ok";
//    }
//
//}
