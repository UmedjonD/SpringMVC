package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.Product;
import com.epam.springbootjspexample.repository.RepositoryProduct;
import com.epam.springbootjspexample.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProductImpl implements ServiceProduct {

    @Autowired
    private RepositoryProduct repositoryProduct;
    @Override
    public String addProduct(Product product) {
        return null;
    }

    @Override
    public String removeProduct(Product product) {
        return null;
    }

    @Override
    public String editProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getlistProducts() {
        return repositoryProduct.listProducts();
    }
}
