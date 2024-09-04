package com.stone_payments.desafio_backend.repositories;

import com.stone_payments.desafio_backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
