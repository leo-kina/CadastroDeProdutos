package com.example.demo.infra.persistence;

import com.example.demo.core.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

// ProductsRepository.java
public interface ProductsRepository extends JpaRepository<ProductsEntity, Long> {
    // The correct method name must match the field name in ProductsEntity
    Optional<ProductsEntity> findByIdentifier(UUID identifier);
}