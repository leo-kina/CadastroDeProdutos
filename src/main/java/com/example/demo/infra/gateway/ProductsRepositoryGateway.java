package com.example.demo.infra.gateway;

import com.example.demo.core.entities.Products;
import com.example.demo.core.gateway.ProductsGateway;
import com.example.demo.infra.mapper.ProductsEntityMapper;
import com.example.demo.infra.persistence.ProductsEntity;
import com.example.demo.infra.persistence.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductsRepositoryGateway implements ProductsGateway {
    private final ProductsEntityMapper productsEntityMapper;
    private final ProductsRepository productsRepository;



    @Override
    public Products criarProduto(Products products) {
        ProductsEntity entity = productsEntityMapper.toEntity(products);
        ProductsEntity novoevento = productsRepository.save(entity);
        return productsEntityMapper.toDomain(novoevento);
    }

    @Override
    public List<Products> listarProdutos() {
        List<ProductsEntity> lista = productsRepository.findAll();
        return lista.stream().map(productsEntityMapper::toDomain).toList();
    }

    @Override
    public Optional<Products> acharPorIdentificador(UUID identifier) {
        return Optional.empty();
    }
}
