package com.example.demo.controller;

import com.example.demo.model.Collector;
import com.example.demo.model.ComicContent;
import org.hibernate.annotations.Fetch;
import org.hibernate.mapping.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/Collectors")
public class CollectorController {

    @Autowired
    private CollectorRepository collectorRepository;

    @Autowired
    private ContentRepository contentRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Collector> collectorList() {
        return collectorRepository.findAll();
    }

}
