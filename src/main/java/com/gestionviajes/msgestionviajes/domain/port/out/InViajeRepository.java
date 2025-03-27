package com.gestionviajes.msgestionviajes.domain.port.out;

import com.gestionviajes.msgestionviajes.domain.entity.Viaje;

import java.util.List;
import java.util.Optional;

public interface InViajeRepository {
    List<Viaje> findAll();
    Optional<Viaje> findById(Long id);
    Viaje save(Viaje viaje);
    void deleteById(Long id);
}
