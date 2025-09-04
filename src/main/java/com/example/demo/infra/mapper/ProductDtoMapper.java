package com.example.demo.infra.mapper;

import com.example.demo.core.entities.Products;
import com.example.demo.infra.dtos.ProductsDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {
    public ProductsDTO toDto(Products products){
        return new ProductsDTO(
                products.id(),
                products.name(),
                products.description(),
                products.identifier(),
                products.price(),
                products.category(),
                products.stock()
        );
    }
    public Products toDomain(ProductsDTO productsDTO){
        return new Products(
                productsDTO.id(),
                productsDTO.name(),
                productsDTO.description(),
                productsDTO.identifier(),
                productsDTO.price(),
                productsDTO.category(),
                productsDTO.stock()
        );
    }

}
