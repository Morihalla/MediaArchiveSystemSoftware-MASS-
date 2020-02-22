package com.example.demo.controller;

import com.example.demo.model.ComicContent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends CrudRepository <ComicContent, String> {

    List<ComicContent> findAll();

    ComicContent save (ComicContent comicContent);

    @Override
    void delete(ComicContent comicContent);
}
