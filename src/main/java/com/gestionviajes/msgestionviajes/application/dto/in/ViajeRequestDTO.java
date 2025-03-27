package com.gestionviajes.msgestionviajes.application.dto.in;

public record ViajeRequestDTO(
        String origen,
        String destino,
        String fecha,
        String hora,
        Long id
) {
}
