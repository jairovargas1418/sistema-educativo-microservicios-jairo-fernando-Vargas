package com.asignaturas.servicio.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matriculas.servicio.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {
}