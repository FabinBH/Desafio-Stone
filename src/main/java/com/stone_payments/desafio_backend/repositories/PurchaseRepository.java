package com.stone_payments.desafio_backend.repositories;

import com.stone_payments.desafio_backend.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
