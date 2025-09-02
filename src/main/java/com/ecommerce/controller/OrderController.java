// src/main/java/com/ecommerce/controller/OrderController.java
package com.ecommerce.controller;

import com.ecommerce.dto.OrderRequestDto;
import com.ecommerce.dto.OrderResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public ResponseEntity<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto dto) {
        // TODO: call service
        return ResponseEntity.ok(new OrderResponseDto());
    }

    @GetMapping
    public ResponseEntity<List<OrderResponseDto>> getOrders() {
        // TODO: call service
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDto> getOrder(@PathVariable Long id) {
        // TODO: call service
        return ResponseEntity.ok(new OrderResponseDto());
    }
}
