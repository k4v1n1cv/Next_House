package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "reservaalquiler")
public class Reservaalquiler {
    @Id
    @Column(name = "id_reserva", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "precio_mensual", nullable = false)
    private Double precioMensual;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id_arrendatario", nullable = false)
    private Usuario usuarioIdArrendatario;

    @OneToMany(mappedBy = "reservaalquilerIdReserva")
    private Set<Pago> pagos = new LinkedHashSet<>();

}