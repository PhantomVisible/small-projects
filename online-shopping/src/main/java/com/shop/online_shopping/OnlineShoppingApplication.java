package com.shop.online_shopping;

import com.shop.online_shopping.entity.Author;
import com.shop.online_shopping.entity.Book;
import com.shop.online_shopping.entity.Patron;
import com.shop.online_shopping.service.LibraryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OnlineShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingApplication.class, args);
    }

    @Bean
    CommandLineRunner run(LibraryService libraryService) {
        return args -> {
            // Create authors
            Author author1 = new Author();
            author1.setName("J.K. Rowling");
            author1.setBiography("British author, best known for the Harry Potter series.");
            libraryService.addAuthor(author1);

            Author author2 = new Author();
            author2.setName("George R.R. Martin");
            author2.setBiography("American novelist, known for A Song of Ice and Fire.");
            libraryService.addAuthor(author2);

            // Create books
            Book book1 = new Book();
            book1.setTitle("Harry Potter and the Philosopher's Stone");
            book1.setIsbn("9780747532699");
            book1.setPublicationDate(LocalDate.of(1997, 6, 26));
            book1.setAuthor(author1);
            libraryService.addBook(book1);

            Book book2 = new Book();
            book2.setTitle("A Game of Thrones");
            book2.setIsbn("9780553103540");
            book2.setPublicationDate(LocalDate.of(1996, 8, 6));
            book2.setAuthor(author2);
            libraryService.addBook(book2);

            // Create patrons
            Patron patron1 = new Patron();
            patron1.setName("Alice");
            patron1.setEmail("alice@example.com");
            libraryService.addPatron(patron1);

            Patron patron2 = new Patron();
            patron2.setName("Bob");
            patron2.setEmail("bob@example.com");
            libraryService.addPatron(patron2);

            // Borrow books
            libraryService.borrowBook(patron1.getId(), book1.getId());
            libraryService.borrowBook(patron2.getId(), book2.getId());

            // Print all authors
            System.out.println("Authors:");
            libraryService.getAllAuthors().forEach(a -> System.out.println(a.getName() + " - " + a.getBiography()));

            // Print all books
            System.out.println("\nBooks:");
            libraryService.getAllBooks().forEach(b ->
                    System.out.println(b.getTitle() + " by " + b.getAuthor().getName())
            );

            // Print all patrons and their borrowed books
            System.out.println("\nPatrons and borrowed books:");
            libraryService.getAllPatrons().forEach(p -> {
                System.out.println(p.getName() + " borrowed:");
                p.getBorrowedBooks().forEach(b -> System.out.println(" - " + b.getTitle()));
            });
        };
    }
}
