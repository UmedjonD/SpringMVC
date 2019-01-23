package com.epam.springbootjspexample.repository.Impl;

import com.epam.springbootjspexample.dto.Book;
import com.epam.springbootjspexample.repository.RepositoryBook;
import com.epam.springbootjspexample.service.Impl.ServiceBookImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryBookImpl implements RepositoryBook {

    private static final Logger logger = LoggerFactory.getLogger(ServiceBookImpl.class);

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(book);
        logger.info("Book dobavlena " + book);
    }
    @Override
    public void updateBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
        logger.info("book successfully update " + book);
    }

    @Override
    public void removeBook(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.load(Book.class, new Integer(id));

        if (book != null) {
            session.delete(book);
        }
        logger.info("Book seccessful delete " + book);
    }

    @Override
    public Book getBookId(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.load(Book.class, new Integer(id));
        logger.info("Book seccessful loaded " + book);
        return book;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> bookList = session.createQuery("from book").list();

        for (Book book: bookList) {
            logger.info("Book list" + book);
        }
        return bookList;
    }
}
