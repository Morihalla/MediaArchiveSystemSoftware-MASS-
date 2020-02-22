package com.example.demo.controller;

import com.example.demo.model.ComicContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Contents")
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ComicContent> contentList() {
        return contentRepository.findAll();
    }
}
