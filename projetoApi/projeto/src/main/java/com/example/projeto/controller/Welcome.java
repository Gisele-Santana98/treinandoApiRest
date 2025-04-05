package com.example.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping
    public String Welcome(){
        return "Bem vindo ao Projeto!";
    }
    @GetMapping("/dev") //EndPoint, que recebe o método GET
    public String dev(){
        return "Desenvolvido por: Gisele Santana";
    }
}
