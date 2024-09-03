package com.springappdemov3.app_demo.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import com.springappdemov3.app_demo.domain.entity.Product;
import com.springappdemov3.app_demo.infrastructure.repository.ProductRepository;

public class ProductService {
    private ProductRepository repositoryProduct = new ProductRepository();

    public List<Product> findAll() {
        return repositoryProduct.findAll().stream().map(p ->{
            Double priceImp = p.getPrice() * 1.45d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }
}
