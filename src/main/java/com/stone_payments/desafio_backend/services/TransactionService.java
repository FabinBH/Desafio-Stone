package com.stone_payments.desafio_backend.services;

import com.stone_payments.desafio_backend.entities.Purchase;
import com.stone_payments.desafio_backend.entities.Transaction;
import com.stone_payments.desafio_backend.repositories.PurchaseRepository;
import com.stone_payments.desafio_backend.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    public Transaction buyItems(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    public List<Purchase> getAllPurchasesById(UUID id) {
        return purchaseRepository.findAllById(id);
    }
}
