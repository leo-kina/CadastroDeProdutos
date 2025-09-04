package com.example.demo.core.entities;

import java.math.BigDecimal;

public record Produtos(
        Long id,
        String name,
        String description,
        BigDecimal price,
        String category,
        Integer stock
) {
}
