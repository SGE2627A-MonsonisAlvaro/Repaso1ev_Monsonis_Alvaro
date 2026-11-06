package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iesdoctorbalmis.spring.repository.AlumnosRepository;

@Controller
@RequestMapping("/alumnos")
public class AlumnosController {

    private final AlumnosRepository alumnosRepository;

    public AlumnosController(AlumnosRepository repo) {
        alumnosRepository = repo;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("alumnos", alumnosRepository.findAll());
        return "alumnos/lista";
    }

}
