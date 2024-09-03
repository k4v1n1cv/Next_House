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
@Table(name = "propiedad")
public class Propiedad {
    @Id
    @Column(name = "id_propiedad", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "fecha_publicacion", nullable = false)
    private LocalDate fechaPublicacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ubicacion_id_ubicacion", nullable = false)
    private Ubicacion ubicacionIdUbicacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id_arrendatario", nullable = false)
    private Usuario usuarioIdArrendatario;

    @Column(name = "descripcion_arrendador", nullable = false, length = 50)
    private String descripcionArrendador;

    @OneToMany(mappedBy = "propiedadIdPropiedad")
    private Set<Comentario> comentarios = new LinkedHashSet<>();

}