package com.bednarmartin.api.core.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface StockController {

    @GetMapping(
            value = "/stock/{stockId}",
            produces = "application/json"
    )
    Stock getStock(@PathVariable long stockId);
}
