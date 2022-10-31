package com.xhite.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StokBilgiDto {
    String urunAdi;
    String depoKonumu;
    long stokMiktari;
}
