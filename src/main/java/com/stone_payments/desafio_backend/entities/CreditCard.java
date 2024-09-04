package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CreditCards")
@Getter
@Setter
public class CreditCard {
    private String card_number;
    private String card_holder_name;
    private int value;
    private int cvv;
    private String exp_date;
}
