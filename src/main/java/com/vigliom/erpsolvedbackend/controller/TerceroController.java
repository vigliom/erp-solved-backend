package com.vigliom.erpsolvedbackend.controller;

import com.vigliom.erpsolvedbackend.model.Producto;
import com.vigliom.erpsolvedbackend.model.Tercero;
import com.vigliom.erpsolvedbackend.service.TerceroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tercero")
public class TerceroController {
    @Autowired
    TerceroService service;

    @PostMapping("/add")
    public String add(@RequestBody Tercero tercero){
        service.save(tercero);
        return "new tercero added";
    }

    @GetMapping("/all")
    public List<Tercero> findAll(){
        return service.findAll();
    }
}
