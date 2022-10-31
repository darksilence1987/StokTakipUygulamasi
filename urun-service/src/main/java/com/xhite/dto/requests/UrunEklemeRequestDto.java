package com.xhite.dto.requests;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrunEklemeRequestDto {
    String urunAdi;
    String marka;
    String urunAciklamasi;
    String depoKonumu;
    long stokMiktari;
}
