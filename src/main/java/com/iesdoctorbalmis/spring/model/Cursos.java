package com.iesdoctorbalmis.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cursos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String curso;

    @Column(length = 50)
    private String descripcion;

    @Column(nullable = false, length = 20)
    private int numAlumnos;

    @Column(nullable = false, length = 20)
    private int numGrupos;
}
