package com.razer.app.products.models.dao;

import com.razer.app.products.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository <Producto, Long>{ //using crudrepository

}
