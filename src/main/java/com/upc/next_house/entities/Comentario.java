package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @Column(name = "id_comentario", nullable = false, length = 50)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    @Column(name = "calificacion", nullable = false, length = 50)
    private String calificacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id_arrendatario", nullable = false)
    private Usuario usuarioIdArrendatario;

    @Column(name = "tipo_usuario", nullable = false, length = 50)
    private String tipoUsuario;

    @Column(name = "fecha_comentario", nullable = false)
    private LocalDate fechaComentario;

    @Column(name = "comentario", nullable = false, length = Integer.MAX_VALUE)
    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "propiedad_id_propiedad", nullable = false)
    private Propiedad propiedadIdPropiedad;

}