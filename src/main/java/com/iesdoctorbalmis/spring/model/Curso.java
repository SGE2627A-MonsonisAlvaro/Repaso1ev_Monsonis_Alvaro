package com.iesdoctorbalmis.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private Long id;
    private String curso;
    private String descripcion;
    private int numAlumnos;
    private int numGrupos;
}
