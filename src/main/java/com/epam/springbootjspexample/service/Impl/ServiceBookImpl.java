package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.Book;
import com.epam.springbootjspexample.repository.RepositoryBook;
import com.epam.springbootjspexample.service.ServiceBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceBookImpl implements ServiceBook {
    private static final Logger logger = LoggerFactory.getLogger(ServiceBookImpl.class);

    private RepositoryBook repositoryBook;

    public void setRepositoryBook(RepositoryBook repositoryBook) {
        this.repositoryBook = repositoryBook;
    }

//    private SessionFactory sessionFactory;
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.repositoryBook.addBook(book);
    }
    @Transactional
    @Override
    public void updateBook(Book book) {
        this.repositoryBook.updateBook(book);
    }
    @Override
    @Transactional
    public void removeBook(int id) {
        this.repositoryBook.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookId(int id) {
        return this.repositoryBook.getBookId(id);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.repositoryBook.listBooks();
    }
}
