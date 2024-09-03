package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.Ubicacion;
import com.upc.next_house.repositories.UbicacionRepositorio;
import com.upc.next_house.service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionServiceImpl implements UbicacionService {
    @Autowired
    private UbicacionRepositorio ubicacionRepositorio;


    @Override
    public Ubicacion insertarUbicacion(Ubicacion ubicacion) {
        return ubicacionRepositorio.save(ubicacion);
    }

    @Override
    public List<Ubicacion> ListarUbicacion() {
        return ubicacionRepositorio.findAll();
    }

    @Override
    public Ubicacion buscarPorID(Long id) {
        return ubicacionRepositorio.findById(id).get();
    }
}
