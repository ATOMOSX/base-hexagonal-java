package com.gestionviajes.msgestionviajes.infraestructure.repository;

import com.gestionviajes.msgestionviajes.domain.entity.Viaje;
import com.gestionviajes.msgestionviajes.domain.port.out.InViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ViajeRepository implements InViajeRepository {

    @Autowired
    private SpringViajeDataRepository springViajeDataRepository;

    @Override
    public List<Viaje> findAll() {
        return null;
    }

    @Override
    public Optional<Viaje> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Viaje save(Viaje viaje) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
