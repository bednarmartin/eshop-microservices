package com.bednarmartin.api.core.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {

    private Long id;

    private String name;

    private String description;

    private double weight;

    private BigDecimal price;

}
