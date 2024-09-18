package com.upc.next_house.controllers;

import com.upc.next_house.dtos.ComentarioDTO;
import com.upc.next_house.entities.Comentario;
import com.upc.next_house.service.ComentarioService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComentarioController {
    @Autowired
    private ComentarioService cS;

    @PostMapping("/comentario")
    public ResponseEntity<Comentario> insertarComentario(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario comentario = modelMapper.map(comentarioDTO, Comentario.class);
        cS.insertarComentario(comentario);
        return ResponseEntity.ok(comentario);
    }

    @PutMapping("/comentario")
    public ComentarioDTO modificarComentario(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario comentario = modelMapper.map(comentarioDTO, Comentario.class);
        comentario = cS.modificarComentario(comentario);
        return modelMapper.map(comentario, ComentarioDTO.class);
    }

    @DeleteMapping("/comentario")
    public void eliminarComentario(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario comentario = modelMapper.map(comentarioDTO, Comentario.class);
        cS.eliminarComentario(String.valueOf(comentario.getIdComentario()));
    }

    @GetMapping("/comentarios")
    public List<Comentario> listarComentario() {
        return cS.listarComentario();
    }
}
