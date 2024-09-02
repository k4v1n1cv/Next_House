package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ubicacion")
public class Ubicacion {
    @Id
    @Column(name = "id_ubicacion", nullable = false)
    private Integer id;

    @Column(name = "ciudad", nullable = false, length = 50)
    private String ciudad;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @OneToMany(mappedBy = "ubicacionIdUbicacion")
    private Set<Propiedad> propiedads = new LinkedHashSet<>();

}