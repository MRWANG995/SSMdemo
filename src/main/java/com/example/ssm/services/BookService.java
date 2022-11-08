package com.example.ssm.services;

import com.example.ssm.domain.Book;
import java.util.List;

public interface BookService {
    boolean save(Book book);
    boolean update(Book book);
    boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getALL();
}
