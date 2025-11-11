package com.example.bookstore;

import com.example.bookstore.config.AppConfig;
import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BookstoreApplication {
    public static void main(String[] args) {
        // Create Spring context using our configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the BookService bean from Spring context
        BookService bookService = context.getBean(BookService.class);

        // Fetch all books initially
        System.out.println("Initial books:");
        List<Book> books = bookService.getAllBooks();
        books.forEach(System.out::println);

        // Add a new book
        Book newBook = new Book("The Hobbit", "J.R.R. Tolkien");
        bookService.addBook(newBook);
        Book newBook1 = new Book("48 Laws of Power", "Robert Greene");
        bookService.addBook(newBook1);

        // Fetch all books after adding a new one
        System.out.println("\nBooks after adding one:");
        books = bookService.getAllBooks();
        books.forEach(System.out::println);

        // Optional: update a book
        bookService.updateBook(0, new Book("1984 (Updated)", "George Orwell"));

        // Fetch all books after update
        System.out.println("\nBooks after update:");
        books = bookService.getAllBooks();
        books.forEach(System.out::println);

        // Optional: delete a book
        bookService.deleteBook(1);

        // Fetch all books after deletion
        System.out.println("\nBooks after deletion:");
        books = bookService.getAllBooks();
        books.forEach(System.out::println);

        // Close Spring context
        context.close();
    }
}
