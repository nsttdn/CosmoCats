package com.example.cosmocats.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;
import lombok.Value;


@Value
@Builder(toBuilder = true)
public class Order {
    Long id;
    List<Product> products;
    BigDecimal totalPrice;
    String status;

}
