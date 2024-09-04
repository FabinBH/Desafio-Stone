package com.stone_payments.desafio_backend.repositories;

import com.stone_payments.desafio_backend.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
