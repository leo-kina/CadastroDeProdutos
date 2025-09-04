package com.example.demo.infra.mapper;

import com.example.demo.core.entities.Products;
import com.example.demo.infra.persistence.ProductsEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductsEntityMapper {
    public ProductsEntity toEntity(Products products){
        return new ProductsEntity(
                products.id(),
                products.name(),
                products.description(),
                products.identifier(),
                products.price(),
                products.category(),
                products.stock()
        );
    }

    public Products toDomain(ProductsEntity productsEntity){
        return new Products(
                productsEntity.getId(),
                productsEntity.getName(),
                productsEntity.getDescription(),
                productsEntity.getIdentifier(),
                productsEntity.getPrice(),
                productsEntity.getCategory(),
                productsEntity.getStock()
        );
    }
}
