package com.upc.next_house.repositories;

import com.upc.next_house.entities.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UbicacionRepositorio extends JpaRepository<Ubicacion, Long> {
    Optional<Ubicacion> findById(Long id);
}
