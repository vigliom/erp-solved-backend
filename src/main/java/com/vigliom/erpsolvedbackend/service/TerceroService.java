package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Tercero;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TerceroService {
    public Tercero save(Tercero tercero);

    public List<Tercero> findAll();
}
