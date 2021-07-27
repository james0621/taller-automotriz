package com.nexo.automotriz.bussines.repository;

import java.util.List;

import com.nexo.automotriz.model.entity.Producto;

public interface IProductoRepository {
	List<Producto> getAll();
	Producto save(Producto producto);
	void delete(Long id);

}
