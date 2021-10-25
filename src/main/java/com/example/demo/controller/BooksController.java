package com.example.demo.controller;

import com.example.demo.BookRepository;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BooksController {

    @Autowired
    BookRepository repository;

    @GetMapping("book")
    public String createBook(@RequestParam String name, String author){
        return repository.create(new Book(name, author)).name;
    }


    @GetMapping("booklist")
    public Collection<Book> createBook(){
        return repository.getAll();
    }

}
