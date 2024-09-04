package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Purchases")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID purchaseId;
    private UUID clientId;
    private int value;
    private String date;
    private String cardNumber;
}
