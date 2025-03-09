package com.programmingtechie.product_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "t_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String description;
    private BigDecimal price;
}
