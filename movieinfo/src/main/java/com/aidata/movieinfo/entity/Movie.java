package com.aidata.movieinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movietbl")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mcode;

    @Column(nullable = false, length = 100)
    private String mname;

    @Column(nullable = false, length = 50)
    private String mdirector;

    @Column(nullable = false, length = 50)
    private String mnation;

    @Column(nullable = false, length = 100)
    private String mgenre;

    @Column(nullable = false, length = 100)
    private String mactor;

    @Column(nullable = false, length = 10)
    private String mopen;

    @Column(length = 2000)
    private String msynopsis;

    @Column(length = 50)
    private String moriname;

    @Column(length = 50)
    private String msysname;
}
