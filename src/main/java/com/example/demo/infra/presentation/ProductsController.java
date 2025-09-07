package com.example.demo.infra.presentation;

import com.example.demo.core.entities.Products;
import com.example.demo.core.usecases.CreateProductsUsecase;
import com.example.demo.core.usecases.ListProductsUsecase;
import com.example.demo.infra.dtos.ProductsDTO;
import com.example.demo.infra.mapper.ProductDtoMapper;
import com.example.demo.infra.persistence.ProductsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("produtos")
public class ProductsController {
    private final ProductDtoMapper productsDTO;
    private final ListProductsUsecase listProductsUsecase;
    private final CreateProductsUsecase createProductsUsecase;

    public ProductsController(ProductDtoMapper productsDTO, ListProductsUsecase listProductsUsecase, CreateProductsUsecase createProductsUsecase) {
        this.productsDTO = productsDTO;
        this.listProductsUsecase = listProductsUsecase;
        this.createProductsUsecase = createProductsUsecase;
    }

    @GetMapping("/listar")
    public List<ProductsDTO> listarprodutos(){
        return listProductsUsecase.execute().stream().map(productsDTO::toDto).toList();
    }

    @PostMapping("/criar")
    public ProductsDTO criarprodutos(@RequestBody ProductsDTO products){
        Products novoproduto = createProductsUsecase.excute(productsDTO.toDomain(products));
        return productsDTO.toDto(novoproduto);


    }
}
