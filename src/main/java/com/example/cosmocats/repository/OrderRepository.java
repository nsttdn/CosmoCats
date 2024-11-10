package com.example.cosmocats.repository;

import com.example.cosmocats.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
