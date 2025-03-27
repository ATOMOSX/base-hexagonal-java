package com.gestionviajes.msgestionviajes.application.service;

import com.gestionviajes.msgestionviajes.domain.entity.Viaje;
import com.gestionviajes.msgestionviajes.domain.port.in.InViajeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService implements InViajeService {
    @Override
    public List<Viaje> listarTodos() {
        return null;
    }

    @Override
    public Optional<Viaje> obtenerPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Viaje crear(Viaje viaje) {
        return null;
    }

    @Override
    public boolean eliminar(Long id) {

        return false;
    }
}
