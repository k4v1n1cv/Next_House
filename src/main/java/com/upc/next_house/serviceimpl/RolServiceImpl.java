package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.Rol;
import com.upc.next_house.entities.Usuario;
import com.upc.next_house.repositories.RolRepositorio;
import com.upc.next_house.repositories.UsuarioRepositorio;
import com.upc.next_house.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepositorio rR;

    @Transactional
    @Override
    public Rol save(Rol rol) {
        return rR.save(rol);
    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Rol listId(int id) {
        return rR.findById(id).orElse(new Rol());
    }
}
