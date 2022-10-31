package com.xhite.repository.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tblstok")
public class Stok {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    long id;
    long urunId;
    String urunAdi;
    String depoKonumu;
    long stokMiktari;
}