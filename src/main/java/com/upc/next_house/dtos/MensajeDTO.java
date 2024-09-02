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
public class MensajeDTO {
    private Integer id;
    private String contenido;
    private LocalDate fechaEnvio;
    private String tipo;
    private Usuario arrendatarioIdArrendatario;
}
