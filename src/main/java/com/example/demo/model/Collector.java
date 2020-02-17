package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "earth_616")
public class Collector {

    @Id
    @Column("Id")
    String id;

    @Column("title")
    String title;

    @Column("era")
    String era;

    @Column("age")
    String age;
}
