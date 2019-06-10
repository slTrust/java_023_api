package com.xiedaimala.shopping_cart.cart;

import com.xiedaimala.shopping_cart.cart.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    public CartController() {

    }

    /**
     * List carts
     */
    @GetMapping("/carts")
    public ResponseEntity<ListCartResponse> listProducts() {
        return new ResponseEntity<>(new ListCartResponse(), HttpStatus.OK);
    }

    /**
     * Get cart
     */
    @GetMapping("/carts/{cartId}")
    public ResponseEntity<GetCartResponse> getCart(@PathVariable String cartId) {
        return new ResponseEntity<>(new GetCartResponse(), HttpStatus.OK);
    }

    /**
     * Update product 更改购物车属性, 添加和删除购物车中的商品的操作
     */
    @PutMapping("/carts/{cartId}")
    public ResponseEntity<UpdateCartResponse> updateProduct(@PathVariable String cartId, @RequestBody UpdateCartRequest updateCartRequest) {
        return new ResponseEntity<>(new UpdateCartResponse(), HttpStatus.OK);
    }
}
