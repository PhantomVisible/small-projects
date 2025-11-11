package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository  // Marks this class as a Spring-managed bean
public class InMemoryBookRepository implements BookRepository {

    private final List<Book> books = new ArrayList<>();

    // Constructor to add some initial books (optional)
    public InMemoryBookRepository() {
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Brave New World", "Aldous Huxley"));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books); // Return a copy to avoid external modification
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void update(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            books.set(index, book);
        } else {
            throw new IndexOutOfBoundsException("Invalid book index: " + index);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid book index: " + index);
        }
    }
}
