package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "content_list")
public class ComicContent implements Serializable {

    @Id
    @Column(name = "Id")
    String id;

    @Column(name = "Title")
    String title;

    @Column(name = "Series")
    String series;

    @ManyToMany (mappedBy = "contents")
    @Column(name = "Collectors")
    private List <Collector> collectors = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setCollectors(List<Collector> collectors) {
        this.collectors = collectors;
    }
}
