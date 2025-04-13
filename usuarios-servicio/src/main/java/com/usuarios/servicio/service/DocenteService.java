package com.usuarios.servicio.service;

import com.usuarios.servicio.model.Docente;
import com.usuarios.servicio.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    // Obtener todos los docentes
    
    public List<Docente> obtenerTodos() {
        return docenteRepository.findAll();

    }

    // Guardar un nuevo docente
    
    public Docente guardar(Docente docente) {
        return docenteRepository.save(docente);
    }

    // Obtener un docente por su ID
    public Optional<Docente> obtenerPorId(Long id) {
        return docenteRepository.findById(id);
    }

    // Eliminar un docente por su ID
    public void eliminar(Long id) {
        docenteRepository.deleteById(id);
    }
}