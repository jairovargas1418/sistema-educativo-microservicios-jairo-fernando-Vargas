package com.asignaturas.servicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asignaturas.servicio.model.Asignatura;
import com.asignaturas.servicio.repository.AsignaturaRepository;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository repository;

    public List<Asignatura> obtenerTodas() {
        return repository.findAll();
    }

    public Asignatura guardar(Asignatura asignatura) {
        return repository.save(asignatura);
    }

    public void eliminar(int id) {
        repository.deleteById(id);
    }
}
