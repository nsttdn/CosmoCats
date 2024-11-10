package com.example.cosmocats.service;

import com.example.cosmocats.dto.ProductDTO;
import com.example.cosmocats.mapper.ProductMapper;
import com.example.cosmocats.repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private ProductMapper productMapper;

  public List<ProductDTO> getAllProducts() {
    return productRepository.findAll().stream()
        .map(productMapper::toDTO)
        .collect(Collectors.toList());
  }

  // Other CRUD methods
}

