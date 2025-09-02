// src/main/java/com/ecommerce/dto/OrderResponseDto.java
package com.ecommerce.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderResponseDto {
    private Long orderId;
    private Long userId;
    private String status;
    private Double totalAmount;
    private String orderDate;
    private List<CartItemDto> items;
}
