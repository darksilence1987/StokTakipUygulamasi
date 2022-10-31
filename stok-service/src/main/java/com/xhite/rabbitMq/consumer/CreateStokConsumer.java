//package com.xhite.rabbitMq.consumer;
//
//import com.xhite.rabbitMq.model.CreateStok;
//import com.xhite.repository.entities.Stok;
//import com.xhite.service.StokService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//@RequiredArgsConstructor
//public class CreateStokConsumer {
//
//    private  final StokService stokService;
//    @RabbitListener(queues = "queue-auth-create-user")
//    public void createUserMessageConsumer(CreateStok createStok){
//        Stok stok = stokService.findOptionalByUrunIdAndDepoKonumu(createStok.getUrunId(), createStok.getDepoKonumu());
//        if(stok == null) stokService.save(stok);
//        else{
//
//        }
//    }
//}