package com.epam.springbootjspexample.repository;

import com.epam.springbootjspexample.dto.Book;

import java.util.List;

public interface RepositoryBook {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookId(int id);

    public List<Book> listBooks();

}
