package com.epam.springbootjspexample.repository.Impl;

import com.epam.springbootjspexample.dto.Product;
import com.epam.springbootjspexample.repository.RepositoryProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryProductImpl implements RepositoryProduct {

    private static final Logger logger = LoggerFactory.getLogger(RepositoryProductImpl.class);
    //создание сессии для соед с бд
    //private SessionFactory sessionFactory;
    private List<Product> productList = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void removeProduct(int id) {

    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public List<Product> listProducts() {
        return null;
    }
}
