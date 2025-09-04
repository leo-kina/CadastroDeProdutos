package com.example.demo.core.usecases;

import com.example.demo.core.entities.Products;

import java.util.List;

public interface ListProductsUsecase {
    List<Products> execute();
}
