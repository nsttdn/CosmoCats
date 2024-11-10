package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Category;
import com.example.cosmocats.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
