package com.shop.online_shopping.repository;

import com.shop.online_shopping.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatronRepository extends JpaRepository<Patron, Long> {
    // Optional: custom query methods
    // Example: List<Patron> findByNameContaining(String name);
    // Example: Patron findByEmail(String email);
}
