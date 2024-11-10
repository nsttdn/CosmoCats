package com.example.cosmocats.domain;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Long id;
    private List<Product> products;
    private BigDecimal totalPrice;
    private String status;
}
