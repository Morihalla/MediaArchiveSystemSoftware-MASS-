package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(schema = "Earth_616")
public class Collector implements Serializable {

    @Id
    @Column("Id")
    String id;

    @Column("title")
    String title;

    @Column("era")
    String era;

    @Column("age")
    String age;

    @ManyToMany
    @JoinTable (name = "LinkTable",
    joinColumns = @JoinColumn (name = "CollectorId"),
    inverseJoinColumns = @JoinColumn (name = "ContentID"))
    private Collection <ComicContent> contents = new ArrayList<>();
}
