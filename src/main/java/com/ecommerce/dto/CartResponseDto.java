// src/main/java/com/ecommerce/dto/CartResponseDto.java
package com.ecommerce.dto;

import lombok.Data;
import java.util.List;

@Data
public class CartResponseDto {
    private Long userId;
    private List<CartItemDto> items;
    private Double grandTotal;
}
