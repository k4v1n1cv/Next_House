package com.upc.next_house.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UbicacionDTO {
    private Integer id;
    private String ciudad;
    private String direccion;

}
