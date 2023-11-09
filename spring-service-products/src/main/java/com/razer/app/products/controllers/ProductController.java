package com.razer.app.products.controllers;

import com.razer.app.products.models.entity.Producto;
import com.razer.app.products.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public IProductoService iProductoService;

    @GetMapping("/Listar")
    public List<Producto> listar(){
        return iProductoService.findAll();
    }

    @GetMapping("/Listar/{id}")
    public List<Producto> listarPorId(@PathVariable Long id){
        return (List<Producto>) iProductoService.findById(id);
    }
}
