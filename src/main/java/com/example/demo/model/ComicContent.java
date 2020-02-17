package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ContentList")
public class ComicContent {

    @Id
    @Column("Id")
    String id;

    @Column("Title")
    String title;

    @Column("Series")
    String series;
}
