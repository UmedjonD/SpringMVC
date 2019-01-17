package com.epam.springbootjspexample.service;

import com.epam.springbootjspexample.dto.Product;

public interface ServiceProduct {

     String addProduct(Product product);
     String removeProduct(Product product);
     String editProduct(Product product);
}
