package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectorController {

@RequestMapping(value = "Collectors", method = RequestMethod.GET)
    public List<Collector> collectorList() {
    CollectorRepository collectorRepository = null;
    collectorRepository.findAll().forEach(collector -> collectorList().add(collector));
    return collectorList();
}


}
