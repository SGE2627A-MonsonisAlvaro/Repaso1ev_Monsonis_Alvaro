package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("libros")
public class LibrosController {

    @GetMapping
    public String lista() {
        return "libros/lista";
    }

}
