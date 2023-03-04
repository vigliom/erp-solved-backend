package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Producto;

import java.util.List;

public interface ProductoService {
    public Producto save(Producto producto);

    public List<Producto> findAll();
}
