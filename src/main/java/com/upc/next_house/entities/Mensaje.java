package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "mensaje")
public class Mensaje {
    @Id
    @Column(name = "id_mensaje", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contenido", nullable = false, length = 50)
    private String contenido;

    @Column(name = "fecha_envio", nullable = false)
    private LocalDate fechaEnvio;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "arrendatario_id_arrendatario", nullable = false)
    private Usuario arrendatarioIdArrendatario;

}