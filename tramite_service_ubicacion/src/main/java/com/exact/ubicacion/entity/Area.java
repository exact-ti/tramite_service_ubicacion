package com.exact.ubicacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="area")
public class Area implements Serializable{	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="area_id")
	private Long id;
		
	private String nombre;
	
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name="sede_id")
	private Sede sede;	
	
		
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Sede getSede() {
		return sede;
	}



	public void setSede(Sede sede) {
		this.sede = sede;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
