package br.com.tiago.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helo")
public class HelloController {

    @GetMapping
    public String saudacao(){
        return "Não desista Tiago Nascimento Hilario";
    }
}