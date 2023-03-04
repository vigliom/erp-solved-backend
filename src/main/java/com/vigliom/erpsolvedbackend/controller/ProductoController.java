package com.vigliom.erpsolvedbackend.controller;

import com.vigliom.erpsolvedbackend.model.Producto;
import com.vigliom.erpsolvedbackend.model.Tercero;
import com.vigliom.erpsolvedbackend.service.ProductoService;
import com.vigliom.erpsolvedbackend.service.ProductoServiceImpl;
import com.vigliom.erpsolvedbackend.service.TerceroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService service;

    @PostMapping("/add")
    public String add(@RequestBody Producto producto){
        service.save(producto);
        return "new tercero added";
    }

    @GetMapping("/all")
    public List<Producto> findAll(){
        return service.findAll();
    }
}
