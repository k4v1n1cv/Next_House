package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.Usuario;
import com.upc.next_house.repositories.UsuarioRepositorio;
import com.upc.next_house.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    @Override
    public Usuario insertarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Long Id) {
        return usuarioRepositorio.findById(Id).get();
    }


}



//version 1