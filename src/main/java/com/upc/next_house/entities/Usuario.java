package com.upc.next_house.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id_usuario", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", nullable = false, length = 50)
    private String usuario;

    @Column(name = "dni", nullable = false)
    private Integer dni;

    @Column(name = "nombre_completo", nullable = false, length = 50)
    private String nombreCompleto;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "telefono", nullable = false)
    private Integer telefono;

    @Column(name = "contrasena", nullable = false, length = 50)
    private String contrasena;

    @OneToMany(mappedBy = "usuarioIdArrendatario")
    private Set<Comentario> comentarios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "arrendatarioIdArrendatario")
    private Set<Mensaje> mensajes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "usuarioIdArrendatario")
    private Set<Propiedad> propiedads = new LinkedHashSet<>();

    @OneToMany(mappedBy = "usuarioIdArrendatario")
    private Set<Reservaalquiler> reservaalquilers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "usuarioIdArrendatario")
    private Set<Rol> rols = new LinkedHashSet<>();

}