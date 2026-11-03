package com.iesdoctorbalmis.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libros {
    private Long id;
    private String curso;
    private String area;
    private String isbn;
    private String titutlo;
    private String observaciones;
    private String imagen;
    private int cantidad;
}
