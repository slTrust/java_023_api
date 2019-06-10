package com.xiedaimala.shopping_cart.cart;

import com.xiedaimala.shopping_cart.cart.model.GetCartResponse;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class CartControllerTest {
    private CartController cartController = new CartController();

    @Test
    public void shouldGetCartSuccessfully() {
        ResponseEntity<GetCartResponse> response = cartController.getCart("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
