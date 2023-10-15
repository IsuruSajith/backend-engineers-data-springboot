package com.example.backendengineerdata.entity;

import com.example.backendengineerdata.util.Gender;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

public class Student {
    @Id
    String index;
    @Column(nullable = false, length = 100)
    String name;
    @Column(nullable = false, length = 100)
    String profession;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    Gender gender;

}
