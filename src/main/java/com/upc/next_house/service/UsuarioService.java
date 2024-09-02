package com.upc.next_house.service;

import com.upc.next_house.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario insertarUsuario(Usuario usuario);
    public List<Usuario> listarUsuario();

    public Usuario modificarUsuario(Usuario usuario);

    public Usuario buscarPorId(Long Id);

}
