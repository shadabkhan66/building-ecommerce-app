// src/main/java/com/ecommerce/service/impl/CartServiceImpl.java
package com.ecommerce.service.impl;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<CartItem> getCart(User user) {
        return cartRepository.findByUser(user);
    }

    @Override
    public CartItem addToCart(User user, Long productId, int quantity) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem item = new CartItem();
        item.setUser(user);
        item.setProduct(product);
        item.setQuantity(quantity);

        return cartRepository.save(item);
    }

    @Override
    public void removeFromCart(User user, Long productId) {
        List<CartItem> items = cartRepository.findByUser(user);
        items.stream()
             .filter(i -> i.getProduct().getId().equals(productId))
             .findFirst()
             .ifPresent(cartRepository::delete);
    }
}
