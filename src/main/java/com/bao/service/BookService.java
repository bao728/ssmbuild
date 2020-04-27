package com.bao.service;

import com.bao.pojo.Books;

import java.util.List;

public interface BookService {
    int addBook(Books books);

    int deleteBook( int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
