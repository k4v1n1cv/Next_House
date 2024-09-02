package com.upc.next_house.dtos;

import com.upc.next_house.entities.OpcionesPago;
import com.upc.next_house.entities.Reservaalquiler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagoDTO {
    private Integer id;
    private LocalDate fechaTransaccion;
    private Integer monto;
    private Reservaalquiler reservaalquilerIdReserva;
    private OpcionesPago opcionesPagoIdPago;
}
