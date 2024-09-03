package com.upc.next_house.service;

import com.upc.next_house.entities.Ubicacion;

import java.util.List;

public interface UbicacionService {
    public Ubicacion insertarUbicacion(Ubicacion ubicacion);
    public List<Ubicacion> ListarUbicacion();
    public Ubicacion buscarPorID(Long id);
}
