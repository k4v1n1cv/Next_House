package com.upc.next_house.repositories;

import com.upc.next_house.entities.OpcionesPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionesPagoRepositorio extends JpaRepository<OpcionesPago, Integer> {

}
