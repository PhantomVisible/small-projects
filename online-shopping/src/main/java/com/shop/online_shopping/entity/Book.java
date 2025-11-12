package com.shop.online_shopping.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(unique = true, nullable = false)
    private String isbn;

    private LocalDate publicationDate;

    // Many books belong to one author
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    // Many books can be borrowed by many patrons
    @ManyToMany(mappedBy = "borrowedBooks", fetch = FetchType.EAGER)
    private Set<Patron> borrowers = new HashSet<>();

    // Constructors
    public Book() {}

    public Book(String title, String isbn, LocalDate publicationDate, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Patron> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Set<Patron> borrowers) {
        this.borrowers = borrowers;
    }

    // Utility methods
    public void addBorrower(Patron patron) {
        borrowers.add(patron);
        patron.getBorrowedBooks().add(this);
    }

    public void removeBorrower(Patron patron) {
        borrowers.remove(patron);
        patron.getBorrowedBooks().remove(this);
    }
}
