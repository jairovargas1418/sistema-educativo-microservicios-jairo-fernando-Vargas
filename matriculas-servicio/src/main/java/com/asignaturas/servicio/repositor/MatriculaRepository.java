package com.asignaturas.servicio.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matriculas.servicio.model.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}