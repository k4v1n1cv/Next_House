package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @Column(name = "id_pago", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_transaccion", nullable = false)
    private LocalDate fechaTransaccion;

    @Column(name = "monto", nullable = false)
    private Integer monto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reservaalquiler_id_reserva", nullable = false)
    private Reservaalquiler reservaalquilerIdReserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "opciones_pago_id_pago", nullable = false)
    private OpcionesPago opcionesPagoIdPago;

}