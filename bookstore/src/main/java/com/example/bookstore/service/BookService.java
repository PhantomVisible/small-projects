package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Marks this class as a Spring-managed service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor-based dependency injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Retrieve all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Add a new book
    public void addBook(Book book) {
        bookRepository.add(book);
    }

    // Update a book by index
    public void updateBook(int index, Book book) {
        bookRepository.update(index, book);
    }

    // Delete a book by index
    public void deleteBook(int index) {
        bookRepository.delete(index);
    }
}
