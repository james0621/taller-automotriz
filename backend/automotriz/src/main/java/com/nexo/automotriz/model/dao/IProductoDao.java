package com.nexo.automotriz.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.nexo.automotriz.model.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
