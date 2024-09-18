package com.upc.next_house.serviceimpl;

import com.upc.next_house.entities.Pago;
import com.upc.next_house.repositories.PagoRepositorio;
import com.upc.next_house.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    private PagoRepositorio pR;
    @Transactional

    @Override
    public Pago save(Pago pago) {
        return pR.save(pago);
    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(Long id) {
        pR.deleteById(id);
    }

    @Override
    public Pago listId(Long id) {
        return pR.findById((id)).orElse(new Pago());
    }
}
