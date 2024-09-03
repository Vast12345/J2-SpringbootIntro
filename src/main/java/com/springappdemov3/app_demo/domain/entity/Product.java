package com.springappdemov3.app_demo.domain.entity;

public class Product {
    private Long Id;
    private String name;
    private Long price;

    public Product() {

    }
    public Product(Long Id, String name, Long price) {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    
}
