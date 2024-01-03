package com.example.LibaryProject.Dto;

import com.example.LibaryProject.Enums.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student_book")
public class StudentBookDTO {
//    StudentBook (id,student_id,book_id,createdDate,Status,returnedDate,duration)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private LocalDateTime createdDate;
    private LocalDateTime returnedDate;
    private Status status;

    private String duration;


}
