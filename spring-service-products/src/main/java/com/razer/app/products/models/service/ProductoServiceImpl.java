package com.razer.app.products.models.service;

import com.razer.app.products.models.dao.ProductoDao;
import com.razer.app.products.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //registra esta clase como un beans para poder inyectarla en otro componente
public class ProductoServiceImpl implements IProductoService {

    @Autowired // inhyeccion
    ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
}
