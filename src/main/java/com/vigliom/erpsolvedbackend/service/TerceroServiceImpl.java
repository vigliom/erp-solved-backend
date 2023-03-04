package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Tercero;
import com.vigliom.erpsolvedbackend.repository.ITerceroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerceroServiceImpl implements TerceroService{
    @Autowired
    private ITerceroRepository repository;
    @Override
    public Tercero save(Tercero tercero) {
        return repository.save(tercero);
    }

    @Override
    public List<Tercero> findAll() {
        return repository.findAll();
    }
}
