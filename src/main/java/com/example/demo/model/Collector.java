package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Earth_616")
public class Collector implements Serializable {

    @Id
    @Column(name = "Id")
    String id;

    @Column(name = "title")
    String title;

    @Column(name = "era")
    String era;

    @Column(name = "age")
    String age;

    @ManyToMany
    @JoinTable (name = "LinkTable",
    joinColumns = @JoinColumn (name = "CollectorId"),
    inverseJoinColumns = @JoinColumn (name = "ContentID"))
    private Collection <ComicContent> contents = new ArrayList<>();
}
