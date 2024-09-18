package com.upc.next_house.controllers;

import com.upc.next_house.dtos.PagoDTO;
import com.upc.next_house.entities.Pago;
import com.upc.next_house.service.PagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Pago")
public class PagoController {
    @Autowired
    private PagoService pagoService;
    @PostMapping("/Insertar")
    public PagoDTO saveMarineHabitats(@RequestBody PagoDTO pagoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Pago pago = modelMapper.map(pagoDTO, Pago.class);
        pago = pagoService.save(pago);
        return modelMapper.map(pago, PagoDTO.class);
    }
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody PagoDTO pagoDTO) {
        ModelMapper d=new ModelMapper();
        Pago pago = d.map(pagoDTO,Pago.class);
        pagoService.save(pago);
    }
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<PagoDTO> listar(){
        return pagoService.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Long id){
        pagoService.delete(id);
    }

    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id") Long id){
        ModelMapper m= new ModelMapper();
        PagoDTO dto=m.map(pagoService.listId(id),PagoDTO.class);
        return dto;
    }

}
