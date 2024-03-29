package com.xhite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UrunServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UrunServiceApplication.class, args);
    }
}
