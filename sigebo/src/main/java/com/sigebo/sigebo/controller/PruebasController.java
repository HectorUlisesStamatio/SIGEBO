package com.sigebo.sigebo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebasController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
