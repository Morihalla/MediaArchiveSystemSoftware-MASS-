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

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Collection<ComicContent> getContents() {
        return contents;
    }

    public void setContents(Collection<ComicContent> contents) {
        this.contents = contents;
    }
}
