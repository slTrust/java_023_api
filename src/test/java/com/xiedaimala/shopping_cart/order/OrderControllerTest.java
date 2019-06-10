package com.xiedaimala.shopping_cart.order;

import com.xiedaimala.shopping_cart.order.model.GetOrderResponse;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class OrderControllerTest {
    private OrderController orderController = new OrderController();

    @Test
    public void shouldGetOrderSuccessfully() {
        ResponseEntity<GetOrderResponse> response = orderController.getOrder("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
