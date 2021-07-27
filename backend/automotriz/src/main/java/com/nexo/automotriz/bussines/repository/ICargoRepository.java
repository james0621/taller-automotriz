package com.nexo.automotriz.bussines.repository;

import java.util.List;

import com.nexo.automotriz.model.entity.Cargo;

public interface ICargoRepository {
		List<Cargo> getAll();
		Cargo save(Cargo Cargo);
		void delete(Long id);
		

}
