package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/cursos")
public class CursosController {

    @GetMapping
    public String lista() {
        return "cursos/lista";
    }

}
