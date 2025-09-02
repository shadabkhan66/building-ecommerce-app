// src/main/java/com/ecommerce/service/UserService.java
package com.ecommerce.service;

import com.ecommerce.model.User;
import java.util.Optional;

public interface UserService {
    User register(User user);
    Optional<User> findByEmail(String email);
    User updateUser(Long id, User updatedUser);
}
