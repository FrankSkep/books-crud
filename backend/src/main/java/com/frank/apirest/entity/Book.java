package com.frank.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es requerido")
    @Size(max = 100, message = "El título no puede tener más de 100 caracteres")
    private String titulo;

    @NotBlank(message = "El autor es obligatorio")
    @Size(max = 100, message = "El autor no puede tener más de 100 caracteres")
    private String autor;

    @NotBlank(message = "La edición es obligatoria")
    @Size(max = 50, message = "La edición no puede tener más de 50 caracteres")
    private String edicion;

    @Min(value = 1, message = "El número de páginas debe ser mayor a 0")
    private int numPaginas;
}
