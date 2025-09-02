// src/main/java/com/ecommerce/service/CartService.java
package com.ecommerce.service;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.User;
import java.util.List;

public interface CartService {
    List<CartItem> getCart(User user);
    CartItem addToCart(User user, Long productId, int quantity);
    void removeFromCart(User user, Long productId);
}
