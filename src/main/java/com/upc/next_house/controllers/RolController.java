package com.upc.next_house.controllers;

import com.upc.next_house.dtos.RolDTO;
import com.upc.next_house.entities.Rol;
import com.upc.next_house.service.RolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Rol")
public class RolController {
    @Autowired
    private RolService rolService;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RolDTO tiposDeUsuarioDTO) {
        ModelMapper d=new ModelMapper();
        Rol rol = d.map(tiposDeUsuarioDTO,Rol.class);
        rolService.save(rol);
    }
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody RolDTO rolDTO) {
        ModelMapper d=new ModelMapper();
        Rol rol = d.map(rolDTO, Rol.class);
        rolService.save(rol);
    }
    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<RolDTO> listar(){
        return rolService.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        rolService.delete(id);
    }

    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RolDTO dto=m.map(rolService.listId(id),RolDTO.class);
        return dto;
    }
}
