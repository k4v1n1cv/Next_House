package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "opciones_pago")
public class OpcionesPago {
    @Id
    @Column(name = "id_oppago", nullable = false)
    private Integer id;

    @Column(name = "metodo_pago", nullable = false, length = 50)
    private String metodoPago;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    @OneToMany(mappedBy = "opcionesPagoIdPago")
    private Set<Pago> pagos = new LinkedHashSet<>();

}