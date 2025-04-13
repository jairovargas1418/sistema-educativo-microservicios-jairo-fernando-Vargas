package com.matriculas.servicio.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "asignatura_id", nullable = false)
    private Asignatura asignatura;

    @Temporal(TemporalType.DATE)
    private Date fechaMatricula;

    // Getters y Setters
}

