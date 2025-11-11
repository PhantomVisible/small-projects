package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import java.util.List;

public interface BookRepository {

    // Retrieve all books
    List<Book> findAll();

    // Add a new book
    void add(Book book);

    // Update an existing book by index (simple approach)
    void update(int index, Book book);

    // Delete a book by index
    void delete(int index);
}
