package com.example.cosmocats.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Long id;
    private List<Product> products;
    private BigDecimal totalPrice;
    private String status;
}
