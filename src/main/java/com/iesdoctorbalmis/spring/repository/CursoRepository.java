package com.iesdoctorbalmis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdoctorbalmis.spring.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
