package com.xiedaimala.shopping_cart.cart.model;

import java.util.Map;

public class Cart {
    private String id;
    private String name;
    private String description;
    private Map<String,Integer> products;

    public Cart(String id, String name, String description, Map<String, Integer> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }
}
