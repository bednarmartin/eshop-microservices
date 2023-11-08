package com.bednarmartin.api.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductAggregate {

    private Long id;

    private String name;

    private String description;

    private double weight;

    private BigDecimal price;

    private int available;

    List<ReviewSummary> reviewSummaries;
}
