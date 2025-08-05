package com.example.projectionsdemo.repository;

import com.example.projectionsdemo.entity.Book;
import com.example.projectionsdemo.dto.BookSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<BookSummary> findBy();
    Page<BookSummary> findAllBy(Pageable pageable);
}