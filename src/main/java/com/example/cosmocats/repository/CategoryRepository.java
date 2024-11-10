package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Category;
import com.example.cosmocats.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  // Метод для знаходження продукту за його ID
  Optional<Category> findById(Long id);

  // Метод для отримання всіх продуктів
  List<Category> findAll();

  // Метод для видалення продукту за ID
  void deleteById(Long id);

  // Метод для перевірки наявності продукту за його назвою
  boolean existsByName(String name);
}
