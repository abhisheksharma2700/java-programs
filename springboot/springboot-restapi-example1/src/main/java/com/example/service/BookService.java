package com.example.service;

import com.example.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books= new ArrayList<>();
    public BookService(){
        books.add(new Book(1,"Rich dad Poor dad",300));
        books.add(new Book(2,"the psychology of money",250));
        books.add(new Book(3,"Atomic habits",200));

    }
    public List<Book> findAllBooks(){
        return books;
    }
    public Book findBookById(int id){
        return books.stream().filter(book -> book.getId()==id).findFirst().orElse(null);

    }
    public void deleteAllBooks(){
        books.clear();
    }
}
