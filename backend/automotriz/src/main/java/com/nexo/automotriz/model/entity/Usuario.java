package com.nexo.automotriz.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	// Identificador unico para el registro de los usuarios
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//nombre del usuario
	private String nombre;
	
	// Relacion con los cargos registrados
	@Column(name = "id_cargo")
	private Long idCargo;
	
	//fecha de ingreso del empleado, debe ser menor o igual a la fecha actual
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ingreso")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fechaIngreso;
	
	@ManyToOne
	@JoinColumn(name = "id_cargo",insertable = false, updatable = false)
	private Cargo cargo;

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	 

}
