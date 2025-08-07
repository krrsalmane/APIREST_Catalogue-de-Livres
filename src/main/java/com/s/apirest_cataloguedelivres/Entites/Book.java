package com.s.apirest_cataloguedelivres.Entites;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Book {
@Id
@GeneratedValue
   private Long   id;
   private String name;
   private String biography;
}
