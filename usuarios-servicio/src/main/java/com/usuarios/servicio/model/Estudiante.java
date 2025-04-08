package com.usuarios.servicio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private String email;
    @SuppressWarnings("unused")
	private String telefono;

    // Getters y setters
}
