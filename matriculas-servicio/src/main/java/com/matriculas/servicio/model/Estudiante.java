package com.matriculas.servicio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private String correo;

    // Getters y Setters
}