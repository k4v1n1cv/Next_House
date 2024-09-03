package com.upc.next_house.service;

import com.upc.next_house.entities.Comentario;

import java.util.List;

public interface ComentarioService {
    public Comentario insertarComentario(Comentario comentario);

    public Comentario modificarComentario(Comentario comentario);

    public void eliminarComentario(String Id);

    public List<Comentario> listarComentario();
}
