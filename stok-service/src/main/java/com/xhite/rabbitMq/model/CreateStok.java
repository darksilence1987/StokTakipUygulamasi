package com.xhite.rabbitMq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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