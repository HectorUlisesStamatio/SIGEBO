package com.sicobo.sicobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebasController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/dash")
    public String dash(Model model){
        String pagina = "Dashboard";
        model.addAttribute("Pagina",pagina);
        return "adminViews/dashboard";
    }
    @GetMapping("/login")
    public String login(Model model){
        String pagina = "Inicio";
        model.addAttribute("Pagina",pagina);
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        String pagina = "Registro";
        model.addAttribute("Pagina",pagina);
        return "register";
    }

    @GetMapping("/blanco")
    public String blanco(Model model){
        String pagina = "Ejemplo";
        model.addAttribute("Pagina",pagina);
        return "paginaEnBlanco";
    }
}
