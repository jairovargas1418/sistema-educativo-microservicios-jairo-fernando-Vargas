package com.matriculas.servicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matriculas.servicio.model.Asignatura;
import com.matriculas.servicio.repository.AsignaturaRepository;

@Service
public class AsignaturaService {
    @Autowired
    private AsignaturaRepository repository;

    // Obtener todas las asignaturas
    
    public List<Asignatura> obtenerTodas() {
        return repository.findAll();
    }

    // Guardar una nueva asignatura
    
    public Asignatura guardar(Asignatura asignatura) {
        return repository.save(asignatura);
    }

    // Eliminar una asignatura por ID
    
    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
