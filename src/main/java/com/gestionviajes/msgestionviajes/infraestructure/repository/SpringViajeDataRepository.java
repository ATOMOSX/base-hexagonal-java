package com.gestionviajes.msgestionviajes.infraestructure.repository;

import com.gestionviajes.msgestionviajes.domain.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringViajeDataRepository  extends JpaRepository<Viaje, Long> {
}
