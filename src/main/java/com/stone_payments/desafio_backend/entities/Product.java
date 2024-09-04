package com.stone_payments.desafio_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column
    private String title;

    @Column
    private int price;

    @Column
    private String zipcode;

    @Column
    private String seller;

    @Column
    private String thumbnailHd;

    @Column
    private String date;
}
