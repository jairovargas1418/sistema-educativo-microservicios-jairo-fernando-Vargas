package com.matriculas.servicio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.matriculas.servicio.model.Matricula;
import com.matriculas.servicio.service.MatriculaService;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService service;

    // Obtener todas las matrículas
    @GetMapping
    public List<Matricula> obtenerTodas() {
        return service.obtenerTodas();
    }

    // Registrar una nueva matrícula
    @PostMapping
    public Matricula registrar(@RequestBody Matricula matricula) {
        return service.registrar(matricula);
    }

    // Eliminar una matrícula por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}