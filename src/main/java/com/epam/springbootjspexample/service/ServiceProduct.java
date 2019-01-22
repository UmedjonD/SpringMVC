package com.epam.springbootjspexample.service;

import com.epam.springbootjspexample.dto.Product;

import java.util.List;

public interface ServiceProduct {

     String addProduct(Product product);
     String removeProduct(Product product);
     String editProduct(Product product);

     List<Product> getlistProducts();
}
