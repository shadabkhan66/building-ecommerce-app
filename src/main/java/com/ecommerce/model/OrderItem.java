// src/main/java/com/ecommerce/model/OrderItem.java
package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Data @NoArgsConstructor @AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
    private Double price;
}
