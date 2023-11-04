package com.example.backendengineerdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(nullable = false, length = 100)
    int id;
    @Column(nullable = false, length = 100)
    String name;
    @Column(nullable = false, length = 100)
    String website;
    @Column(nullable = false)
    int employees;
    @Column(nullable = false, length = 100)
    String category;
}
