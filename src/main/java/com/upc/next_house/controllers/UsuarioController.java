package com.upc.next_house.controllers;


import com.upc.next_house.dtos.UsuarioDTO;
import com.upc.next_house.entities.Usuario;
import com.upc.next_house.repositories.UsuarioRepositorio;
import com.upc.next_house.service.UsuarioService;
import jakarta.persistence.Id;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping("/usuario")
    public UsuarioDTO insertarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper modelMapper= new ModelMapper();
        Usuario usuario= modelMapper.map(usuarioDTO, Usuario.class);
        usuario= usuarioService.insertarUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }
    @GetMapping("/listar_usuario")
    public List<Usuario> listarUsuario(){
        return usuarioService.listarUsuario();
    }

    @PutMapping("/actualizar_usuario")
    public UsuarioDTO modificarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper modelMapper= new ModelMapper();
        Usuario usuario= modelMapper.map(usuarioDTO, Usuario.class);
        usuario= usuarioService.modificarUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    @GetMapping("/buscar_id_usuario/{id}")
        public UsuarioDTO buscarPorId(@PathVariable Long id){
        ModelMapper modelMapper= new ModelMapper();
        Usuario usuario= usuarioService.buscarPorId(id);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

}
