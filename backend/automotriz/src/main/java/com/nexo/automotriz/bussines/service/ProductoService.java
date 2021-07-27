package com.nexo.automotriz.bussines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexo.automotriz.bussines.repository.IProductoRepository;
import com.nexo.automotriz.model.dao.IProductoDao;
import com.nexo.automotriz.model.entity.Producto;

@Service
public class ProductoService implements IProductoRepository{
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	public List<Producto> getAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long id) {
		
		productoDao.deleteById(id);
	}

	
	
}
