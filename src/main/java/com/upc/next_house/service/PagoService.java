package com.upc.next_house.service;

import com.upc.next_house.entities.Pago;

import java.util.List;

public interface PagoService {
    public Pago save(Pago pago);
    public List<Pago> list();
    public void delete(Long id);
    public Pago listId(Long id);
}
