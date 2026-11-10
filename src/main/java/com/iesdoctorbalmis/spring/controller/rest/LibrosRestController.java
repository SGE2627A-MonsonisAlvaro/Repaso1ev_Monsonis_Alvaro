package com.iesdoctorbalmis.spring.controller.rest;

import com.iesdoctorbalmis.spring.entity.Libros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iesdoctorbalmis.spring.repository.LibrosRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/libros")
public class LibrosRestController {

    private final LibrosRepository librosRepository;

    public LibrosRestController(LibrosRepository libros) {
        librosRepository = libros;
    }

    @GetMapping
    public List<Libros> listar() {
        return librosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libros> buscarPorId(@PathVariable Long id) {
        return librosRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
