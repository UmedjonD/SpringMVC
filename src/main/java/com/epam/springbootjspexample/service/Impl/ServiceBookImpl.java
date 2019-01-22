package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.Book;
import com.epam.springbootjspexample.service.ServiceBook;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBookImpl implements ServiceBook {
    private static final Logger logger = LoggerFactory.getLogger(ServiceBookImpl.class);

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void removeBook(int id) {

    }

    @Override
    public Book getBookId(int id) {
        return null;
    }

    @Override
    public List<Book> listBooks(int id) {
        return null;
    }
}
