package com.upc.next_house.dtos;


import com.upc.next_house.entities.Propiedad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComentarioDTO {
    private String idComentario;
    private String calificacion;
    private String tipoUsuario;
    private LocalDate fechaComentario;
    private String comentario;
    private Propiedad propiedadIdPropiedad;
}
