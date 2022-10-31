package com.xhite.repository;

import com.xhite.repository.entities.Stok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StokRepository extends JpaRepository<Stok, Long> {
}
