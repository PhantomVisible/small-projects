package com.shop.online_shopping.repository;

import com.shop.online_shopping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Optional: custom query methods
    // Example: List<Book> findByTitleContaining(String title);
    // Example: List<Book> findByAuthorName(String authorName);
}
