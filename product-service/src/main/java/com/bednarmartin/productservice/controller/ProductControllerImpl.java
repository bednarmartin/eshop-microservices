package com.bednarmartin.productservice.controller;

import com.bednarmartin.api.core.product.Product;
import com.bednarmartin.api.core.product.ProductController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductController {

    @Override
    public Product getProduct(long productId) {
        return null;
    }
}
