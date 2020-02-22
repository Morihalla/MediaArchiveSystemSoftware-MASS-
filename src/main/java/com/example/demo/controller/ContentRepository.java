package com.example.demo.controller;

import com.example.demo.model.ComicContent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CrudRepository <ComicContent, String> {
}
