package com.example.logplatform.service;

import com.example.logplatform.entity.Product;

import java.util.List;
public interface ProductService {
    List<Product> findHotList();

    Product findById(Integer id);

    void addNewProduct(String username, Product product);
}
