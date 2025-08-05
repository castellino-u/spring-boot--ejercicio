package com.example.projectionsdemo.controller;

import com.example.projectionsdemo.dto.BookSummary;
import com.example.projectionsdemo.entity.Book;
import com.example.projectionsdemo.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return repository.findAll();
    }

    @GetMapping("/summary")
    public List<BookSummary> getSummaries() {
        return repository.findBy();
    }

    @GetMapping("/summary/page")
    public Page<BookSummary> getPagedSummaries(Pageable pageable) {
        return repository.findAllBy(pageable);
    }

}