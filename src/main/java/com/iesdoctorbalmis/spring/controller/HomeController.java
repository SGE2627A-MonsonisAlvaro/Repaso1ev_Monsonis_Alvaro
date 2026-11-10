package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iesdoctorbalmis.spring.repository.AlumnosRepository;
import com.iesdoctorbalmis.spring.repository.CursosRepository;
import com.iesdoctorbalmis.spring.repository.LibrosRepository;

@Controller
public class HomeController {

    private final AlumnosRepository alumnosRepository;
    private final CursosRepository cursosRepository;
    private final LibrosRepository librosRepository;

    public HomeController(AlumnosRepository alumnos, CursosRepository cursos, LibrosRepository libros) {
        alumnosRepository = alumnos;
        cursosRepository = cursos;
        librosRepository = libros;
    }

    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("libros", librosRepository.findAll());
        model.addAttribute("totalAlumnos", alumnosRepository.count());
        model.addAttribute("totalCursos", cursosRepository.count());
        model.addAttribute("totalLibros", librosRepository.count());

        return "index";
    }
}
