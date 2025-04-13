package com.usuarios.servicio.service;

import com.usuarios.servicio.model.Estudiante;
import com.usuarios.servicio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    // Guardar un nuevo estudiante
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Obtener un estudiante por su ID
    public Optional<Estudiante> obtenerPorId(Long id) {
        return estudianteRepository.findById(id);
    }

    // Eliminar un estudiante por su ID
    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}
