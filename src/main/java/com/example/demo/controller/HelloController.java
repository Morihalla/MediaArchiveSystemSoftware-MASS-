package com.example.demo.controller;

import com.example.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private Hello helloService;

    @Autowired
    public void setHelloService (Hello helloService) {
        this.helloService=helloService;
    }

    @RequestMapping ("hello")
    public ModelAndView handleHello(){
        String text = helloService.sayHello();
        return new ModelAndView("helloView","message",text);
    }
}
