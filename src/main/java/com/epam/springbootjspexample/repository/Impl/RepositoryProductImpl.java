package com.epam.springbootjspexample.repository.Impl;

import com.epam.springbootjspexample.dto.Product;
import com.epam.springbootjspexample.repository.RepositoryProduct;

import java.util.ArrayList;
import java.util.List;

public class RepositoryProductImpl implements RepositoryProduct {

    private List<Product> productList = new ArrayList<>();

    @Override
    public void addproduct(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }
}
