package com.shop.online_shopping.service;

import com.shop.online_shopping.entity.Author;
import com.shop.online_shopping.entity.Book;
import com.shop.online_shopping.entity.Patron;
import com.shop.online_shopping.repository.AuthorRepository;
import com.shop.online_shopping.repository.BookRepository;
import com.shop.online_shopping.repository.PatronRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LibraryService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PatronRepository patronRepository;

    public LibraryService(AuthorRepository authorRepository,
                          BookRepository bookRepository,
                          PatronRepository patronRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.patronRepository = patronRepository;
    }

    // ----------------- AUTHORS -----------------
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    // ----------------- BOOKS -----------------
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // ----------------- PATRONS -----------------
    public Patron addPatron(Patron patron) {
        return patronRepository.save(patron);
    }

    public List<Patron> getAllPatrons() {
        return patronRepository.findAll();
    }

    public Optional<Patron> getPatronById(Long id) {
        return patronRepository.findById(id);
    }

    // ----------------- BORROW BOOK -----------------
    public void borrowBook(Long patronId, Long bookId) {
        Patron patron = patronRepository.findById(patronId)
                .orElseThrow(() -> new RuntimeException("Patron not found"));
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        patron.getBorrowedBooks().add(book);
        patronRepository.save(patron);
    }
}
