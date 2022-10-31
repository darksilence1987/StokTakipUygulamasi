package com.xhite.dto.response;

import lombok.*;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StokResponseDto {
    long urunId;
    String urunAdi;
    String depoKonumu;
    long stokMiktari;
}