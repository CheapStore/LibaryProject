package com.example.LibaryProject.Dto;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "student")
public class StudentDTO {
//    Student (id, name, surname,phone, createdDate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    @Column(name = "student_id")
    private  int id;
    @Column(name = "student_name")
    private  String name;
    @Column(name = "student_surname")
    private  String surname;
    @Column(name = "student_phone",length = 13)
    private  String phone;

    @Column(name = "student_createdDate")
    private LocalDate date;

}
