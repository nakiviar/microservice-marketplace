package com.razer.app.products.models.service;

import com.razer.app.products.models.entity.Producto;

import java.util.List;

public interface IProductoService {
        public List<Producto> findAll();
        public Producto findById(Long id);

}
