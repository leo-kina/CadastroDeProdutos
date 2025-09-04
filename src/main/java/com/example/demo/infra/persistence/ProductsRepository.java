package com.example.demo.infra.persistence;

import com.example.demo.core.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductsRepository extends JpaRepository<ProductsEntity, Long > {
    Optional<Products> findByIdentificador(UUID identificador);
}
