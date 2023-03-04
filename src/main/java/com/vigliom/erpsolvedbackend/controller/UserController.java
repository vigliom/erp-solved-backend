package com.vigliom.erpsolvedbackend.controller;

import com.vigliom.erpsolvedbackend.model.Producto;
import com.vigliom.erpsolvedbackend.model.Usuario;
import com.vigliom.erpsolvedbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/add")
    public String add(@RequestBody Usuario user){
        service.save(user);
        return "new user added";
    }

    @GetMapping("/all")
    public List<Usuario> findAll(){
        return service.findAll();
    }

}
