package com.nexo.automotriz.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.nexo.automotriz.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
