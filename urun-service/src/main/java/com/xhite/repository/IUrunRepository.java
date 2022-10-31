package com.xhite.repository;

import com.xhite.repository.entities.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUrunRepository extends JpaRepository<Urun, Long> {
    public Optional<Urun> findOptionalByUrunAdi(String urunAdi);
}
