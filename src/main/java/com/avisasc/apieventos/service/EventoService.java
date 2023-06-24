package com.avisasc.apieventos.service;

import com.avisasc.apieventos.model.Coupon;
import com.avisasc.apieventos.model.Evento;
import com.avisasc.apieventos.repository.EventoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventoService {

    @Autowired
    EventoRepository repository;
    Coupon coupon = new Coupon();
    public void createEvento(Evento evento) {
        String code = coupon.generateCouponCode(evento);
        evento.setCoupon(code);
        repository.save(evento);
    }

    public List<Evento> getAllEventos() {
        return repository.findAll();
    }

    public Optional<Evento> getEventoById(Long id) {
        return repository.findById(id);
    }

    public void deleteEvento(Long id) {
        repository.deleteById(id);
    }
}
