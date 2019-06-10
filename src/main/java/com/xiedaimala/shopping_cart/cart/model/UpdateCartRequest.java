package com.xiedaimala.shopping_cart.cart.model;

import java.util.Map;

public class UpdateCartRequest {
    private Map<String,Integer> products;

    public UpdateCartRequest() {
    }

    public UpdateCartRequest(Map<String, Integer> products) {
        this.products = products;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }
}

