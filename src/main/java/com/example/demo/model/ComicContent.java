package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="ContentList")
public class ComicContent implements Serializable {

    @Id
    @Column(name = "Id")
    String id;

    @Column(name = "Title")
    String title;

    @Column(name = "Series")
    String series;

    @ManyToMany (mappedBy = "contents")
    private Collection<Collector> collectors = new ArrayList<>();
}
