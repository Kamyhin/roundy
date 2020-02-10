package com.komandas.roundy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("roundy")
public class MessageController {

    @GetMapping
    public String list(){
        return "Hello Roundy";
    }
}
