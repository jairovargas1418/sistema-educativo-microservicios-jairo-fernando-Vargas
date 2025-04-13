package com.matriculas.servicio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.matriculas.servicio.model.Asignatura;
import com.matriculas.servicio.service.AsignaturaService;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService service;

    // Obtener todas las asignaturas
    @GetMapping
    public List<Asignatura> obtenerTodas() {
        return service.obtenerTodas();
    }

    // Guardar una nueva asignatura
    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return service.guardar(asignatura);
    }

    // Eliminar una asignatura por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}