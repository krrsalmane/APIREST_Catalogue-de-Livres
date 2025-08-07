package com.s.apirest_cataloguedelivres.Entites;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Author {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  Long id;
    private String title ;
    private String isbn ;
    private String author;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public Author(Long id, String title, String isbn, String author, List<Book> books) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.books = books;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
