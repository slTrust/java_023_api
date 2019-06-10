package com.xiedaimala.shopping_cart.order;

import com.xiedaimala.shopping_cart.order.model.*;
import com.xiedaimala.shopping_cart.product.model.GetProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class OrderController {

    /**
     * List carts
     */
    @GetMapping("/orders")
    public ResponseEntity<ListOrderResponse> listOrders() {
        return new ResponseEntity<>(new ListOrderResponse(), HttpStatus.OK);
    }

    /**
     * Get order
     */
    @GetMapping("/orders/{orderId}")
    public ResponseEntity<GetOrderResponse> getOrder(@PathVariable String orderId) {
        return new ResponseEntity<>(new GetOrderResponse(), HttpStatus.OK);
    }

    /**
     * Post order
     */
    @PostMapping("/orders")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        // 实现
        return new ResponseEntity<>(new CreateOrderResponse(), HttpStatus.CREATED);
    }

    /**
     * Put order
     */
    @PutMapping("/orders/{orderId}")
    public ResponseEntity<UpdateOrderResponse> putOrder(@PathVariable String orderId, @RequestBody UpdateOrderRequest updateOrderRequest) {
        // 实现
        return new ResponseEntity<>(new UpdateOrderResponse(), HttpStatus.CREATED);
    }

}
