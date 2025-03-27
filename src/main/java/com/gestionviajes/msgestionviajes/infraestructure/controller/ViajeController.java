package com.gestionviajes.msgestionviajes.infraestructure.controller;

import com.gestionviajes.msgestionviajes.application.dto.out.ViajeResponseDTO;
import com.gestionviajes.msgestionviajes.application.mapper.ViajeMapper;
import com.gestionviajes.msgestionviajes.application.service.ViajeService;
import com.gestionviajes.msgestionviajes.domain.entity.Viaje;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @Autowired
    private ViajeMapper viajeMapper;

    @GetMapping
    @Operation(summary = "Obtener todos los viajes")
    public ResponseEntity<ViajeResponseDTO> obtenerViajes() {
        List<Viaje> viajes = viajeService.listarTodos();
        return ResponseEntity.ok(viajeMapper.toResponse((Viaje) viajes));
    }

    @GetMapping("/cliente/{clienteId}")
    @Operation(summary = "Obtener reservas de un cliente")
    public ResponseEntity<List<ViajeResponseDTO>> obtenerPorCliente(@PathVariable Long clienteId) {
        var reservas = viajeService.obtenerPorId(clienteId);
        return ResponseEntity.ok(reservas.stream().map(viajeMapper::toResponse).toList());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Cancelar una reserva por ID")
    public ResponseEntity<Void> cancelar(@PathVariable Long id) {
        boolean cancelada = viajeService.eliminar(id);
        return cancelada ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}
