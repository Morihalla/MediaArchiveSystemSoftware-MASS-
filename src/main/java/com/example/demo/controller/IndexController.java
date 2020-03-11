package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    // Comme ca tu utilise thymeleaf pour charger ta page principale
    // Avant, ca utilisait un html par defaut sans thymeleaf!
    @GetMapping("/")
    public ModelAndView displayIndex(){
        return new ModelAndView("index");
    }
}
