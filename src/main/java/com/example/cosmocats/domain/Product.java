package com.example.cosmocats.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
public class Product {
    Long id;
    String name;
    String description;
    BigDecimal price;
    Category category;

}

