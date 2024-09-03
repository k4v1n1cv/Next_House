package com.upc.next_house.controllers;

import com.upc.next_house.dtos.UbicacionDTO;
import com.upc.next_house.dtos.UsuarioDTO;
import com.upc.next_house.entities.Ubicacion;
import com.upc.next_house.entities.Usuario;
import com.upc.next_house.service.UbicacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UbicacionController {
    @Autowired
    public UbicacionService ubicacionServicie;
    @PostMapping("/insertarUbicacion")
    public UbicacionDTO insertarUbicacion(@RequestBody UbicacionDTO ubicacionDTO){
        ModelMapper modelMapper= new ModelMapper();
        Ubicacion ubicacion= modelMapper.map(ubicacionDTO, Ubicacion.class);
        ubicacion= ubicacionServicie.insertarUbicacion(ubicacion);
        return modelMapper.map(ubicacion, UbicacionDTO.class);
    }
    @GetMapping("/Listar_Ubicacion")
    public List<Ubicacion>listarUbicacion(){return ubicacionServicie.ListarUbicacion();
    }
    @GetMapping("/buscar_id_ubicacion/{id}")
    public UbicacionDTO buscarPorId(@PathVariable Long id){
        ModelMapper modelMapper= new ModelMapper();
        Ubicacion ubicacion= ubicacionServicie.buscarPorID(id);
        return modelMapper.map(ubicacion, UbicacionDTO.class);
    }

}
