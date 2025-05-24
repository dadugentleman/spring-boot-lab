package com.example.spring.boot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Ruta {

    @GetMapping("/hello")
    public String hello() {
        return "Noroc la toti";
    }

}
