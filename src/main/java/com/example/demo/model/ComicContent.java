package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComicContent {

    @Id
    @Autowired
    String id;

    @Autowired
    String title;

    @Autowired
    String series;
}
