package com.matriculas.servicio.repository;

import java.util.List;

import com.matriculas.servicio.model.Matricula;

public interface MatriculaRepository {

	void deleteById(int id);

	Matricula save(Matricula matricula);

	List<Matricula> findAll();

}
