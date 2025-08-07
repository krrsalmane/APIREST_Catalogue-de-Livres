package com.s.apirest_cataloguedelivres.Entites;
import jakarta.persistence.*;


@Entity
public class Book {
@Id
@GeneratedValue ( strategy = GenerationType.IDENTITY)
   private Long   id;
   private String name;
   private String biography;

   @ManyToOne
   @JoinColumn(name = "author_id")
   private Author author;

   public Book() {
   }

   public Book(Long id, String name, String biography, Author author) {
      this.id = id;
      this.name = name;
      this.biography = biography;
      this.author = author;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getBiography() {
      return biography;
   }

   public void setBiography(String biography) {
      this.biography = biography;
   }

   public Author getAuthor() {
      return author;
   }

   public void setAuthor(Author author) {
      this.author = author;
   }
}
