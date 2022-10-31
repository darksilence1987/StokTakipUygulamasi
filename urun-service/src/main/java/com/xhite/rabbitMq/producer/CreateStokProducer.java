//package com.xhite.rabbitMq.producer;
//
//
//import com.xhite.rabbitMq.model.CreateStok;
//import lombok.RequiredArgsConstructor;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CreateStokProducer {
//    private final RabbitTemplate rabbitTemplate;
//
//    public void sendCreateStokMessage(CreateStok stok){
//        rabbitTemplate.convertAndSend("exchange-auth",
//                "key-auth", stok);
//    }
//}