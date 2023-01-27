package com.project.productservice.service;

import com.project.productservice.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> searchProducts(String query);

    List<Product> getAll();
}
