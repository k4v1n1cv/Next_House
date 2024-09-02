package com.upc.next_house.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OpcionesPadoDTO {
    private Integer id;
    private String metodoPago;
    private String descripcion;

}
