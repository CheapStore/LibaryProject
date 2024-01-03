package com.example.LibaryProject.Dto;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Entity
@Table(name = "book")
public class BookDTO {
//    Book (id,title,author, publishYear)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private  int id;
    @Column(name = "title")
    private String title;
    @Column(name = "auther")
    private String auther;
    @Column(name = "publishYear")
    private LocalDate date;

}
