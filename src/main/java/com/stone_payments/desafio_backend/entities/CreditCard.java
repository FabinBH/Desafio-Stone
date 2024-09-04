package com.stone_payments.desafio_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Long id;

    @Column(length = 16)
    private String card_number;

    @Column
    private String card_holder_name;

    @Column
    private int value_cc;

    @Column(length = 3)
    private int cvv;

    @Column
    private String exp_date;
}
