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

    public Collection<Collector> getCollectors() {
        return collectors;
    }

    public void setCollectors(Collection<Collector> collectors) {
        this.collectors = collectors;
    }
}
