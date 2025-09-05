package com.example.demo.core.usecases;

import com.example.demo.core.entities.Products;
import com.example.demo.core.gateway.ProductsGateway;

public class CreateProductsUsecaseImpl implements CreateProductsUsecase {
    private final ProductsGateway productsGateway;

    public CreateProductsUsecaseImpl(ProductsGateway productsGateway) {
        this.productsGateway = productsGateway;
    }

    @Override
    public Products excute(Products products) {
        return productsGateway.criarProduto(products);
    }
}
