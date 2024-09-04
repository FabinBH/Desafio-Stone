package com.stone_payments.desafio_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;
}
