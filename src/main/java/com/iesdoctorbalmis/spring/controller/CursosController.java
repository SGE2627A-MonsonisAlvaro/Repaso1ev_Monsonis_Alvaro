package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesdoctorbalmis.spring.repository.CursosRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/cursos")
public class CursosController {

    private final CursosRepository cursosRepository;

    public CursosController(CursosRepository repo) {
        cursosRepository = repo;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("cursos", cursosRepository.findAll());
        return "cursos/lista";
    }
}
