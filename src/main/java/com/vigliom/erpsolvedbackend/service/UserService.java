package com.vigliom.erpsolvedbackend.service;

import com.vigliom.erpsolvedbackend.model.Tercero;
import com.vigliom.erpsolvedbackend.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService{
    public Usuario save(Usuario usuario);
    public List<Usuario> findAll();

}
