package com.bednarmartin.orderservice.controller;

import com.bednarmartin.api.core.order.Order;
import com.bednarmartin.api.core.order.OrderController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControllerImpl implements OrderController {
    @Override
    public Order getOrder(long orderId) {
        return null;
    }
}
