package com.upc.next_house.dtos;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {
    private Long id;
    private String usuario;
    private Integer dni;
    private String nombreCompleto;
    private String email;
    private Integer telefono;
    private String contrasena;
}
