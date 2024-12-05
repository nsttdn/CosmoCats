package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Category;
import com.example.cosmocats.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
  boolean existsByName(String name);
}
