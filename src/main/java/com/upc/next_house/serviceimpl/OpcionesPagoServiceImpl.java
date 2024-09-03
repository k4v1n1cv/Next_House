package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.OpcionesPago;
import com.upc.next_house.repositories.OpcionesPagoRepositorio;
import com.upc.next_house.service.OpcionesPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcionesPagoServiceImpl implements OpcionesPagoService {
    @Autowired
    private OpcionesPagoRepositorio oPR;

    @Override
    public OpcionesPago insertarOpcionesPago(OpcionesPago opcionesPago) {
        return oPR.save(opcionesPago);
    }

    @Override
    public OpcionesPago modificarOpcionesPago(OpcionesPago opcionesPago) {
        if(oPR.existsById((opcionesPago.getId()))){
            return oPR.save(opcionesPago);
        }
        return null;
    }

    @Override
    public void eliminarOpcionesPago(Integer Id) {
        if (oPR.existsById(Id)) {
            oPR.deleteById(Id);
        }

    }

    @Override
    public List<OpcionesPago> listarOpcionesPago() {
        return null;
    }
}
