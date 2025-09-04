package com.example.demo.infra.dtos;

import com.example.demo.core.enums.Category;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductsDTO(
        Long id,
        String name,
        String description,
        UUID identifier,
        BigDecimal price,
        Category category,
        Integer stock
) {
}
