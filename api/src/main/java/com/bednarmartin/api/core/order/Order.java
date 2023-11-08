package com.bednarmartin.api.core.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {

    private Long id;

    private List<ProductOrder> products = new ArrayList<>();

    private BigDecimal totalPrice;
}
