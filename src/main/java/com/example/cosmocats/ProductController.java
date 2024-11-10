package com.example.cosmocats;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/api/products")
    public List<String> getAllProducts() {
        return List.of("Product 1", "Product 2");
    }
}

