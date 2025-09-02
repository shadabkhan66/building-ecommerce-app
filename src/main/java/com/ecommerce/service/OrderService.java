// src/main/java/com/ecommerce/service/OrderService.java
package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.model.User;
import java.util.List;

public interface OrderService {
    Order placeOrder(User user, String shippingAddress);
    List<Order> getOrders(User user);
    Order getOrderById(Long id);
}
