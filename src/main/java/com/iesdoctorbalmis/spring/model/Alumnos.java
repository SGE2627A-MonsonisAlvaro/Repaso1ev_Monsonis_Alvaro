package com.iesdoctorbalmis.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumnos {
    private Long id;
    private String nombre;
    private String apellido1;
    private TipoAlumno tipoAlumno;
    private String curso;

}