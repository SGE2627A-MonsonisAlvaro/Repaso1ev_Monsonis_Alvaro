package com.iesdoctorbalmis.spring.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iesdoctorbalmis.spring.entity.Cursos;
import com.iesdoctorbalmis.spring.repository.CursosRepository;

@RestController
@RequestMapping("/api/cursos")
public class CursosRestController {
    private final CursosRepository cursosRepository;

    public CursosRestController(CursosRepository cursos) {
        cursosRepository = cursos;
    }

    @GetMapping
    public List<Cursos> listar() {
        return cursosRepository.findAll();
    }
}
