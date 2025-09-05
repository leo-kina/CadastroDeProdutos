package com.example.demo.infra.presentation;

import com.example.demo.core.entities.Products;
import com.example.demo.core.usecases.ListProductsUsecase;
import com.example.demo.infra.dtos.ProductsDTO;
import com.example.demo.infra.mapper.ProductDtoMapper;
import com.example.demo.infra.persistence.ProductsEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ProductsController {
    private final ProductDtoMapper productsDTO;
    private final ListProductsUsecase listProductsUsecase;

    public ProductsController(ProductDtoMapper productsDTO, ListProductsUsecase listProductsUsecase) {
        this.productsDTO = productsDTO;
        this.listProductsUsecase = listProductsUsecase;
    }

    @GetMapping("/litar")
    public List<ProductsDTO> listarprodutos(){
        return listProductsUsecase.execute().stream().map(productsDTO::toDto).toList();
    }
}
