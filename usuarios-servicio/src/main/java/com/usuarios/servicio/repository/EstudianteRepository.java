package com.usuarios.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.usuarios.servicio.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> { }
