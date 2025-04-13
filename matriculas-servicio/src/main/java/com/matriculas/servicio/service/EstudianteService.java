package com.matriculas.servicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matriculas.servicio.model.Estudiante;
import com.matriculas.servicio.repository.EstudianteRepository;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository repository;

    // Obtener todos los estudiantes
    public List<Estudiante> obtenerTodos() {
        return repository.findAll();
    }

    // Guardar un nuevo estudiante
    public Estudiante guardar(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    // Eliminar un estudiante por ID
    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
