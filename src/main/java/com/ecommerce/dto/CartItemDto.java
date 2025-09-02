// src/main/java/com/ecommerce/dto/CartItemDto.java
package com.ecommerce.dto;

import lombok.Data;

@Data
public class CartItemDto {
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private Double total;
}
