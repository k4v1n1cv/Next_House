package com.upc.next_house.dtos;


import com.upc.next_house.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class RolDTO {
    private Integer id;
    private String tipoUsuario;
    private Usuario usuarioIdArrendatario;
}
