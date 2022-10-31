package com.xhite.repository.entities;

import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tblurun")
public class Urun {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    long id;
    String urunAdi;
    String marka;
    String urunAciklamasi;
}
