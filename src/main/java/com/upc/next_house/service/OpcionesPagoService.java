package com.upc.next_house.service;

import com.upc.next_house.entities.OpcionesPago;

import java.util.List;

public interface OpcionesPagoService {

    public OpcionesPago insertarOpcionesPago(OpcionesPago opcionesPago);

    public OpcionesPago modificarOpcionesPago(OpcionesPago opcionesPago);

    public void eliminarOpcionesPago(Integer Id);

    public List<OpcionesPago> listarOpcionesPago();
}
