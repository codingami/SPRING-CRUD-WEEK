package com.springcrudweek.amirahapi.service;

import java.util.List;

import com.springcrudweek.amirahapi.model.Product;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List < Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}
