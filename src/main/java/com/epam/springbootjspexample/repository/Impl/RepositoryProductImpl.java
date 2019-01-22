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

    private List<Product> productList = new ArrayList<>();

    public RepositoryProductImpl() {
        productList.add(new Product(1,"Java", 450, "https://proglib.io/wp-content/uploads/-000//1/1012145650.jpg"));
        productList.add(new Product(2,"Java", 460, "https://i.pinimg.com/736x/46/3e/65/463e652c3397bb53fa7f04593451052a.jpg"));
        productList.add(new Product(3,"Java", 470, "https://im0-tub-ru.yandex.net/i?id=dcb80408c07a91e7a73facdda26eae50-l&n=13"));
        productList.add(new Product(4,"Java", 480, "http://www.williamspublishing.com/Books/thumb/big/978-5-8459-2070-6.jpg"));
        productList.add(new Product(5,"Java", 490, "https://book24.kz/upload/iblock/ad1/ad111aaa518859b03952bca3c71d461a.jpg"));
        productList.add(new Product(6,"Java", 410, "http://www.williamspublishing.com/Books/thumb/big/978-5-8459-2070-6.jpg"));
        productList.add(new Product(7,"Java", 420, "https://ozon-st.cdn.ngenix.net/multimedia/1019616360.jpg"));
        productList.add(new Product(8,"Java", 430, "http://bookash.pro/b/29/yazyk-programmirovaniya-C-klassika-Computers-Science-anders-heilsberg.jpg"));
        productList.add(new Product(9,"Java", 410, "https://ozon-st.cdn.ngenix.net/multimedia/1019616360.jpg"));
        productList.add(new Product(10,"Java", 200, "http://avidreaders.ru/pics/0/2/131902.jpeg"));
        productList.add(new Product(12,"Java", 300, "https://cdn.tproger.ru/wp-content/uploads/2016/03/1ee3bb3aa317170484be69b8c43b997f-240x280.jpg"));
        productList.add(new Product(13,"Java", 350, "https://i.pinimg.com/736x/46/3e/65/463e652c3397bb53fa7f04593451052a.jpg"));
        productList.add(new Product(14,"Java", 360, "https://im0-tub-ru.yandex.net/i?id=dcb80408c07a91e7a73facdda26eae50-l&n=13"));
        productList.add(new Product(15,"Java", 250, "https://book24.kz/upload/iblock/ad1/ad111aaa518859b03952bca3c71d461a.jpg"));
    }

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
        return productList;
    }
}
