package com.usuarios.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuarios.servicio.model.Docente;
import com.usuarios.servicio.model.Estudiante;

public interface DocenteRepository extends JpaRepository<Docente, Long> {

	Docente save(Docente docente); }

