package com.example.demo;

import com.example.demo.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepository {
    Map<String, Book> books = new HashMap<>();
    public Book create(Book book){
        books.put(book.name, book);
        return book;
    }

    public Collection<Book> getAll(){
        return books.values();
    }
}
