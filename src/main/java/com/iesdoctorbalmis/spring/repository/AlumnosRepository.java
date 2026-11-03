package com.iesdoctorbalmis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdoctorbalmis.spring.model.Alumnos;

public interface AlumnoRepository extends JpaRepository<Alumnos, Long> {

}
