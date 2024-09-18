package com.upc.next_house.service;

import com.upc.next_house.entities.Rol;

import javax.management.relation.Role;
import java.util.List;

public interface RolService {
    public Rol save(Rol rol);
    public List<Rol> list();

    public void delete(int id);
    public Rol listId(int id);
}
