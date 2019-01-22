package com.epam.springbootjspexample.repository;

import com.epam.springbootjspexample.dto.Product;

import java.util.List;

public interface RepositoryProduct {

    void addProduct(Product product);

    void updateProduct(Product product);

    void removeProduct(int id);

    Product getProductById();

    List<Product> listProducts();

}
