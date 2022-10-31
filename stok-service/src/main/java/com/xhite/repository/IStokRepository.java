package com.xhite.repository;

import com.xhite.repository.entities.Stok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface IStokRepository extends JpaRepository<Stok, Long> {
    Optional<Stok> findOptionalByUrunIdAndDepoKonumu(Long urunId, String depoKonumu);
}
