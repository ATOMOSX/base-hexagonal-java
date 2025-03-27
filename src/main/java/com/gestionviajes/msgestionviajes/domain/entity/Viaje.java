package com.gestionviajes.msgestionviajes.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "viajes")
@Entity
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private String fechaSalida;
    private String fechaLlegada;
    private String costo;

}
