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
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID purchaseId;

    @JoinColumn(name = "client_id")
    private UUID clientId;

    @Column
    private int value_p;

    @Column
    private String date;

    @Column
    private String cardNumber;
}
