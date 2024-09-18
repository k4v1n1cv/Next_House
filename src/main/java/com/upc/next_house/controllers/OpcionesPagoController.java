package com.upc.next_house.controllers;

import com.upc.next_house.dtos.OpcionesPagoDTO;
import com.upc.next_house.entities.OpcionesPago;
import com.upc.next_house.service.OpcionesPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OpcionesPagoController {
    @Autowired
    private OpcionesPagoService oPS;

    @PostMapping("/opcionesPago")
    public ResponseEntity<OpcionesPago> insertarOpcionesPago(@RequestBody OpcionesPagoDTO opcionesPagoDTO){
        ModelMapper modelMapper = new ModelMapper();
        OpcionesPago opcionesPago = modelMapper.map(opcionesPagoDTO, OpcionesPago.class);
        oPS.insertarOpcionesPago(opcionesPago);
        return ResponseEntity.ok(opcionesPago);

    }

    @PutMapping("/opcionesPago")
    public OpcionesPagoDTO modificarOpcionesPago(@RequestBody OpcionesPagoDTO opcionesPagoDTO){
        ModelMapper modelMapper = new ModelMapper();
        OpcionesPago opcionesPago = modelMapper.map(opcionesPagoDTO, OpcionesPago.class);
        opcionesPago = oPS.modificarOpcionesPago(opcionesPago);
        return modelMapper.map(opcionesPago, OpcionesPagoDTO.class);
    }

    @DeleteMapping("/opcionesPago")
    public void eliminarOpcionesPago(@RequestBody OpcionesPagoDTO opcionesPagoDTO){
        ModelMapper modelMapper = new ModelMapper();
        OpcionesPago opcionesPago = modelMapper.map(opcionesPagoDTO, OpcionesPago.class);
        oPS.eliminarOpcionesPago(Math.toIntExact(opcionesPago.getId()));
    }

    @GetMapping("/opcionesPago")
    public List<OpcionesPago> listarOpcionesPago(){
        return oPS.listarOpcionesPago();
    }
}
