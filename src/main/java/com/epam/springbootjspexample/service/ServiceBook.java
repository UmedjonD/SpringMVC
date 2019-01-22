package com.epam.springbootjspexample.service;

import com.epam.springbootjspexample.dto.Book;
import com.epam.springbootjspexample.dto.Product;

import java.util.List;

public interface ServiceBook {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookId(int id);

    public List<Book> listBooks(int id);

//    public void editBook(Book book);

}
