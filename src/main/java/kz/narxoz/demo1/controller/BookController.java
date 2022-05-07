package kz.narxoz.demo1.controller;

import kz.narxoz.demo1.model.Books;
import kz.narxoz.demo1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("books")
    public List<Books> getAll() {
        return bookRepository.findAll();
    }
}