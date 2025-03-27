package com.gestionviajes.msgestionviajes.application.mapper;


import com.gestionviajes.msgestionviajes.application.dto.in.ViajeRequestDTO;
import com.gestionviajes.msgestionviajes.application.dto.out.ViajeResponseDTO;
import com.gestionviajes.msgestionviajes.domain.entity.Viaje;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViajeMapper {

    Viaje toModel(ViajeRequestDTO dto);
    ViajeResponseDTO toResponse(Viaje model);
}
