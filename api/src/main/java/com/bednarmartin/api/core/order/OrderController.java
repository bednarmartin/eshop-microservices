package com.bednarmartin.api.core.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderController {

    @GetMapping(
            value = "/order/{orderId}",
            produces = "application/json"
    )
    Order getOrder(@PathVariable long orderId);

}
