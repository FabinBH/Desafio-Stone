package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Transactions")
@Getter
@Setter
public class Transaction {
    private String client_id;
    private String client_name;
    private int total_to_pay;
    private CreditCard credit_card;
}
