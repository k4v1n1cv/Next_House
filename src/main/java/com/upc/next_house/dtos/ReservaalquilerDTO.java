package com.upc.next_house.dtos;


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
public class ReservaalquilerDTO {
    private Integer id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioMensual;
    private String estado;
    private Usuario usuarioIdArrendatario;

}
