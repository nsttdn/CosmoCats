package com.example.cosmocats.service;

import com.example.cosmocats.dto.order.OrderDTO;
import com.example.cosmocats.mapper.OrderMapper;
import com.example.cosmocats.repository.OrderRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private OrderMapper orderMapper;

  public List<OrderDTO> getAllOrders() {
    return orderRepository.findAll().stream()
        .map(orderMapper::toDTO)
        .collect(Collectors.toList());
  }

  // Other CRUD methods
}