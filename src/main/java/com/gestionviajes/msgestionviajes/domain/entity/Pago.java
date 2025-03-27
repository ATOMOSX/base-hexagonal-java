package com.gestionviajes.msgestionviajes.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pagos")
@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reserva;
    private String fecha;
    private String monto;
    private String metodoPago;
}
