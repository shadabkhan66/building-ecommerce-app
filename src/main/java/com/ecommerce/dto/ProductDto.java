// src/main/java/com/ecommerce/dto/ProductDto.java
package com.ecommerce.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Long categoryId;
}
