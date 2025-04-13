package com.usuarios.servicio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @SuppressWarnings("unused")
	private String nombre;
    @SuppressWarnings("unused")
	private String especialidad;
    @SuppressWarnings("unused")
	private String email;

    // Getters y setters
}
