package com.asignaturas.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asignaturas.servicio.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {
}
