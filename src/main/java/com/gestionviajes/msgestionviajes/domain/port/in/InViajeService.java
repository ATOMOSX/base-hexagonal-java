package com.gestionviajes.msgestionviajes.domain.port.in;

import com.gestionviajes.msgestionviajes.domain.entity.Viaje;

import java.util.List;
import java.util.Optional;

public interface InViajeService {
    List<Viaje> listarTodos();
    Optional<Viaje> obtenerPorId(Long id);
    Viaje crear(Viaje viaje);
    boolean eliminar(Long id);
}
