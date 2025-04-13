package com.asignaturas.servicio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.asignaturas.servicio.model.Asignatura;
import com.asignaturas.servicio.service.AsignaturaService;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService service;

    @GetMapping
    public List<Asignatura> obtenerTodas() {
        return service.obtenerTodas();
    }

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return service.guardar(asignatura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}