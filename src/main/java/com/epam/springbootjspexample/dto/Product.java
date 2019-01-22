package com.epam.springbootjspexample.dto;

public class Product {

    private int id;
    private String nameBook;
    private int price;
    private String urt;

    public Product() {
    }

    public Product(int id, String nameBook, int price, String urt) {
        this.id = id;
        this.nameBook = nameBook;
        this.price = price;
        this.urt = urt;
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

    public String getUrt() {
        return urt;
    }

    public void setUrt(String urt) {
        this.urt = urt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", price=" + price +
                ", urt='" + urt + '\'' +
                '}';
    }
}
