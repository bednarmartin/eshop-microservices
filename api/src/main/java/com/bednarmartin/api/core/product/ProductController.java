package com.bednarmartin.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductController {

    @GetMapping(
            value = "/product/{productId}",
            produces = "application/json")
    Product getProduct(@PathVariable long productId);
}
