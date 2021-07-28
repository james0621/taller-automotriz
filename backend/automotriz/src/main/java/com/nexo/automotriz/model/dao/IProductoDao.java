package com.nexo.automotriz.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nexo.automotriz.model.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
	@Query("SELECT p FROM Producto p "
			+ "WHERE UPPER(p.nombre) LIKE '%'|| ?1 ||'%'"
			+ "AND TO_CHAR(p.idUsuarioRegistro, '9999') LIKE '%'|| ?2 || '%'"
			+ "AND TO_CHAR(p.fechaIngreso, 'dd/MM/yyyy') LIKE '%'|| ?3 ||'%'")
	Optional<List<Producto>> findByFechaIngresoOrNombreOrUsuario(String nombreProducto,String nombreUsuario, String fechaIngreso);

}
