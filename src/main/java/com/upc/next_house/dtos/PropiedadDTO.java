package com.upc.next_house.dtos;



import com.upc.next_house.entities.Ubicacion;
import com.upc.next_house.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropiedadDTO {
    private Integer id;
    private String titulo;
    private String descripcion;
    private Double precio;
    private String tipo;
    private String estado;
    private LocalDate fechaPublicacion;
    private String descripcionArrendador;
    private Ubicacion ubicacionIdUbicacion;
    private Usuario usuarioIdArrendatario;

}
