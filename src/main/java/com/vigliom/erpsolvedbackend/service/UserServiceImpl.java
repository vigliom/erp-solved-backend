package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Usuario;
import com.vigliom.erpsolvedbackend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    IUserRepository repository;
    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }
}
