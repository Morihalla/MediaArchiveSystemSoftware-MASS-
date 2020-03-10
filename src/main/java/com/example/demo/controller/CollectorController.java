package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

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

    @GetMapping(value="/result/{tag}")
    public ModelAndView Search(@RequestParam(value = "tag", required = false) String tag, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("Search");

        mav.addObject("tag", tag);
        mav.addObject("Search", collectorRepository.findCollectorsByTitleContaining(tag));

        return Search(tag,request,response);
    }

}
