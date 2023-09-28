package com.platform.bank_v1.investor.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String accountNumber;
    private double amount;
    @Enumerated
    private ProductType type;
}
