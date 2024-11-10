package com.example.cosmocats.mapper;

import com.example.cosmocats.domain.Order;
import com.example.cosmocats.dto.OrderDTO;

public interface OrderMapper {
    OrderDTO toDTO(Order order);
    Order toEntity(OrderDTO orderDTO);
}
