package com.xhite.rabbitMq.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateStok implements Serializable {
    Long urunId;
    String urunAdi;
    String depoKonumu;
    Long stokMiktari;
}