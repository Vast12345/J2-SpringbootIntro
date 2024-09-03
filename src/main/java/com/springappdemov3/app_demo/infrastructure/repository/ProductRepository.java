package com.springappdemov3.app_demo.infrastructure.repository;

import java.util.Arrays;
import java.util.List;

import com.springappdemov3.app_demo.domain.entity.Product;

public class ProductRepository {
    List<Product> products;

    public ProductRepository() {
        this.products = Arrays.asList(
            new Product(1L, "lalala",175L),
            new Product(2L, "lololo",135L),
            new Product(3L, "lilili",200L)
        );
    }
    public List<Product> findAll() {
        return this.products;
    }
    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
