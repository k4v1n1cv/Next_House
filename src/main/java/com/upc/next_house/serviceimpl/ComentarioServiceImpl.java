package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.Comentario;
import com.upc.next_house.repositories.ComentarioRepositorio;
import com.upc.next_house.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService {
    @Autowired
    private ComentarioRepositorio cR;

    @Override
    public Comentario insertarComentario(Comentario comentario) {
        return cR.save(comentario);
    }

    @Override
    public Comentario modificarComentario(Comentario comentario) {
        if(cR.existsById(comentario.getIdComentario())){
            return cR.save(comentario);
        }
        return null;
    }

    @Override
    public void eliminarComentario(String Id) {
        if (cR.existsById(Id)) {
            cR.deleteById(Id);
        }
    }

    @Override
    public List<Comentario> listarComentario() {
        return cR.findAll();
    }
}
