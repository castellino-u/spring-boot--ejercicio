package com.example.projectionsdemo.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;

    public Book() {}

    public Book(String title, String author, String genre, int pages, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}