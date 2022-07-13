package com.example.javabookstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Armen Katvalyan
 */

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "author_name")
    private String author;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    protected Book() {}

    public Book(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, author='%s']",
                id, author);
    }
}
