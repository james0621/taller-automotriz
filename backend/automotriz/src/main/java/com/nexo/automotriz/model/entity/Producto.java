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
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	//Debe ser unico
	@Column(unique = true, nullable = false)
	private String nombre;
	
	//NO debe permitir decimales
	private Integer cantidad;
	
	//Debe ser menor o igual a la fecha actual
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ingreso")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fechaIngreso;
	
	//Relación con tabla de usuarios
	@Column(name = "id_usuario_registro")
	private Long idUsuarioRegistro;
	//Relación con tabla de usuarios
	@Column(name = "id_usuario_modifica")
	private Long idUsuarioModifica;
	
	//Debe ser igual a la fecha de modificación, 
	//guardarlo automaticamente al editar.
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_modifica")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fechaModifica;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario_registro", insertable = false, updatable = false)
	private Usuario usuarioRegistro;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario_modifica", insertable = false, updatable = false)
	private Usuario usuarioModifica;

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Long getIdUsuarioRegistro() {
		return idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(Long idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	public Long getIdUsuarioModifica() {
		return idUsuarioModifica;
	}

	public void setIdUsuarioModifica(Long idUsuarioModifica) {
		this.idUsuarioModifica = idUsuarioModifica;
	}

	public Date getFechaModifica() {
		return fechaModifica;
	}

	public void setFechaModifica(Date fechaModifica) {
		this.fechaModifica = fechaModifica;
	}

	public Usuario getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(Usuario usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Usuario getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(Usuario usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	
}
