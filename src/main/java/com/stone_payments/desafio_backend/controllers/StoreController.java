package com.stone_payments.desafio_backend.controllers;

import com.stone_payments.desafio_backend.entities.Product;
import com.stone_payments.desafio_backend.entities.Purchase;
import com.stone_payments.desafio_backend.entities.Transaction;
import com.stone_payments.desafio_backend.repositories.PurchaseRepository;
import com.stone_payments.desafio_backend.services.ProductService;
import com.stone_payments.desafio_backend.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/starstore")
public class StoreController {
    @Autowired
    private ProductService productService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @PostMapping("/product")
    public ResponseEntity<Product> postProduct(@RequestBody Product product) {
        var newProduct = productService.addProduct(product);
        return ResponseEntity.ok(newProduct);
    }

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/buy")
    public ResponseEntity<Transaction> purchaseData(@RequestBody Transaction transaction) {
        var newTransaction = transactionService.buyItems(transaction);
        return ResponseEntity.ok(newTransaction);
    }

    @GetMapping("/history")
    public List<Purchase> allPurchases() {
        return purchaseRepository.findAll();
    }

    @GetMapping("/history/{clientId}")
    public Optional<Purchase> allPurchasesById(@PathVariable Long clientId) {
        return purchaseRepository.findById(clientId);
    }
}
