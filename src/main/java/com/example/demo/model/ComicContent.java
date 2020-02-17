package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="ContentList")
public class ComicContent implements Serializable {

    @Id
    @Column("Id")
    String id;

    @Column("Title")
    String title;

    @Column("Series")
    String series;

    @ManyToMany (mappedBy = "collectors")
    private Collection<Collector> collectors = new ArrayList<>();
}
