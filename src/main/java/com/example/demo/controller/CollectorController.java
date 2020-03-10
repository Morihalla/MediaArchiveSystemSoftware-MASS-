package com.example.demo.controller;

import com.example.demo.model.Collector;
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

    @GetMapping(value = "/all")
    public List<Collector> collectorList() {
        return collectorRepository.findAll();
    }

    @RequestMapping(value="/search/{tag}")
    public ModelAndView Search(@PathVariable("tag") String tag) {
        ModelAndView mav = new ModelAndView("search");

        mav.addObject("searchTerm", tag);
        mav.addObject("searchResult", collectorRepository.findCollectorsByTitleContaining(tag));

        return mav;
    }

}
