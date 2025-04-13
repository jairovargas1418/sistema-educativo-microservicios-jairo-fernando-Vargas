package com.asignaturas.servicio.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matriculas.servicio.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
