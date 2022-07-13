package com.example.javabookstore.repository;

import com.example.javabookstore.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Armen Katvalyan
 */

public interface UserRepository extends CrudRepository<User, Long> {
}
