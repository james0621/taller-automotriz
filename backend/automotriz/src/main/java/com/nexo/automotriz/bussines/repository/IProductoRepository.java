package com.nexo.automotriz.bussines.repository;

import java.util.List;
import java.util.Optional;

import com.nexo.automotriz.model.entity.Producto;

public interface IProductoRepository {
	List<Producto> getAll();
	Optional<Producto> findByid(Long id);
	Producto save(Producto producto);
	Optional<List<Producto>> findByFechaIngresoOrNombreOrUsuario(String nombreProducto,String nombreUsuario,String fechaIngreso);
	void delete(Long id);

}
