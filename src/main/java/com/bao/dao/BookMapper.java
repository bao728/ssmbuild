package com.bao.dao;

import com.bao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);

    int deleteBook(@Param("bookid") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookid") int id);

    List<Books> queryAllBook();
}
