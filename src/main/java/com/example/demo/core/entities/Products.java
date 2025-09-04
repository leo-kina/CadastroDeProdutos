package com.example.demo.core.entities;

import com.example.demo.core.enums.Category;

import java.math.BigDecimal;
import java.util.UUID;

public record Products(
        Long id,
        String name,
        String description,
        UUID identifier,
        BigDecimal price,
        Category category,
        Integer stock
) {

}
