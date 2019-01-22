package com.epam.springbootjspexample.dto;

public class Product {

    private int id;
    private String nameBook;
    private int price;
    private String url;

    public Product() {
    }

    public Product(int id, String nameBook, int price, String url) {
        this.id = id;
        this.nameBook = nameBook;
        this.price = price;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
