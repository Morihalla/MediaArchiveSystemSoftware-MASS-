package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Collectors")
public class CollectorController {

    @Autowired
    private CollectorRepository collectorRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Collector> collectorList() {
        return collectorRepository.findAll();
    }


}
