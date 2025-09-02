// src/main/java/com/ecommerce/controller/CartController.java
package com.ecommerce.controller;

import com.ecommerce.dto.CartResponseDto;
import com.ecommerce.dto.CartItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping
    public ResponseEntity<CartResponseDto> getCart() {
        // TODO: call service
        return ResponseEntity.ok(new CartResponseDto());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestBody CartItemDto dto) {
        // TODO: call service
        return ResponseEntity.ok("Product added to cart");
    }

    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long productId) {
        // TODO: call service
        return ResponseEntity.ok("Product removed from cart");
    }
}
