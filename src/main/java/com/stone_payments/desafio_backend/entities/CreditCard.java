package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CreditCards")
@Getter
@Setter
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String card_number;
    private String card_holder_name;
    private int value_cc;
    private int cvv;
    private String exp_date;
}
