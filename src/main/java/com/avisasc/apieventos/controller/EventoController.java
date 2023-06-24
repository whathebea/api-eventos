package com.avisasc.apieventos.controller;

import com.avisasc.apieventos.model.Evento;
import com.avisasc.apieventos.service.EventoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EventoController {

    @Autowired
    EventoService service;

    @PostMapping("/create")
    public void createEvento(@RequestBody Evento evento) {
        service.createEvento(evento);
    }

    @GetMapping("/eventos")
    public List<Evento> getEventos() {
        return service.getAllEventos();
    }

    @GetMapping("/{id}")
    public Optional<Evento> getEventoById(@PathVariable Long id) {
        return service.getEventoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEventoById(@PathVariable Long id) {
        service.deleteEvento(id);
    }
}
