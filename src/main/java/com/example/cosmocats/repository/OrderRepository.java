package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Order;
import com.example.cosmocats.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

  // Метод для знаходження продукту за його ID
  Optional<Order> findById(Long id);

  // Метод для отримання всіх продуктів
  List<Order> findAll();

  // Метод для видалення продукту за ID
  void deleteById(Long id);

  // Метод для перевірки наявності продукту за його назвою
  boolean existsByName(String name);
}
