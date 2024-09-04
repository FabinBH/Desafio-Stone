package com.stone_payments.desafio_backend.repositories;

import com.stone_payments.desafio_backend.entities.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
