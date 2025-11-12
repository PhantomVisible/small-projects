package com.shop.online_shopping.repository;

import com.shop.online_shopping.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Optional: you can add custom query methods here if needed
    // Example: List<Author> findByNameContaining(String name);
}
