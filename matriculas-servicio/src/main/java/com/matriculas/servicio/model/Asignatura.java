package com.matriculas.servicio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private int creditos;

    // Getters y Setters
}