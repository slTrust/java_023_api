package com.xiedaimala.shopping_cart.order.model;

public class CreateOrderResponse {
    private Order order;


    public CreateOrderResponse() {
    }

    public CreateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
