package com.example.javabookstore.repository;

import com.example.javabookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Armen Katvalyan
 */

public interface BookRepository extends CrudRepository<Book, Long> {
}
