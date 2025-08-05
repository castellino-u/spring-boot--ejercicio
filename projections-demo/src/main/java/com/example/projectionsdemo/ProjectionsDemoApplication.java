package com.example.projectionsdemo;

import com.example.projectionsdemo.entity.Book;
import com.example.projectionsdemo.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProjectionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectionsDemoApplication.class, args);



    }

    @Bean
    CommandLineRunner initData(BookRepository repo) {
        return args -> {
            repo.save(new Book("El precio de la pasión.", "Gabriel Rolón", "Psicologia", 464, 39.99));
            repo.save(new Book("El lado B del amor.", "Gabriel Rolón", "Psicologia", 416, 45.00));
            repo.save(new Book("Estética", "Hegel", "Filosofía", 1352, 39.00));
        };
    }

}