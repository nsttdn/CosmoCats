package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  // Метод для знаходження продукту за його ID
  Optional<Product> findById(Long id);

  // Метод для отримання всіх продуктів
  List<Product> findAll();

  // Метод для видалення продукту за ID
  void deleteById(Long id);

  // Метод для перевірки наявності продукту за його назвою
  boolean existsByName(String name);
}