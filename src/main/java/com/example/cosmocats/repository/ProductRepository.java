package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
