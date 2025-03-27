package com.gestionviajes.msgestionviajes.application.dto.out;

public record ViajeResponseDTO(
        Long id,
        String origen,
        String destino,
        String fecha,
        String hora
) {
}
