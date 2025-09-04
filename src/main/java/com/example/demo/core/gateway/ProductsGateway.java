package com.example.demo.core.gateway;

import com.example.demo.core.entities.Products;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductsGateway {
    Products criarProduto(Products products);
    List<Products> listarProdutos();
    Optional<Products> acharPorIdentificador(UUID identifier);
}
