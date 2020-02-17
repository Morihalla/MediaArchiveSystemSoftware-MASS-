package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService implements Hello {
    public String sayHello() {
        return "Hello World";
    }
}
