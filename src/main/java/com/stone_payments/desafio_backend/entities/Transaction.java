package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Transactions")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID client_id;

    @Column
    private String client_name;

    @Column
    private int total_to_pay;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_card", referencedColumnName = "id")
    private CreditCard credit_card;
}
