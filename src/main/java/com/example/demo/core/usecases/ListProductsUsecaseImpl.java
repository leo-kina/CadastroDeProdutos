package com.example.demo.core.usecases;

import com.example.demo.core.entities.Products;
import com.example.demo.core.gateway.ProductsGateway;

import java.util.List;

public class ListProductsUsecaseImpl implements ListProductsUsecase {
    private final ProductsGateway productsGateway;

    public ListProductsUsecaseImpl(ProductsGateway productsGateway) {
        this.productsGateway = productsGateway;
    }

    @Override
    public List<Products> execute() {
        return productsGateway.listarProdutos();
    }
}
