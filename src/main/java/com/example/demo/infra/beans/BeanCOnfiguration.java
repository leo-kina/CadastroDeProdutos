package com.example.demo.infra.beans;

import com.example.demo.core.gateway.ProductsGateway;
import com.example.demo.core.usecases.CreateProductsUsecase;
import com.example.demo.core.usecases.CreateProductsUsecaseImpl;
import com.example.demo.core.usecases.ListProductsUsecase;
import com.example.demo.core.usecases.ListProductsUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCOnfiguration {
    @Bean
    public CreateProductsUsecase createProductsUsecase (ProductsGateway productsGateway){
        return new CreateProductsUsecaseImpl(productsGateway);
    }
    @Bean
    public ListProductsUsecase listProductsUsecase (ProductsGateway productsGateway){
        return new ListProductsUsecaseImpl(productsGateway);
    }
}
