package com.matriculas.servicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matriculas.servicio.model.Matricula;
import com.matriculas.servicio.repository.MatriculaRepository;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository repository;

    public List<Matricula> obtenerTodas() {
        return repository.findAll();
    }

    public Matricula registrar(Matricula matricula) {
        return repository.save(matricula);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
