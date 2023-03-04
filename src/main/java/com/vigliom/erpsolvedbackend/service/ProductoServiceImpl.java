package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Producto;
import com.vigliom.erpsolvedbackend.repository.IProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    IProductoRepository repository;
    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }
}
