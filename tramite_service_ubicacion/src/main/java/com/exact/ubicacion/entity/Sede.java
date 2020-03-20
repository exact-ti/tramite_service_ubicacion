package com.exact.ubicacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.Data;

@Entity
@Data
@Table(name="sede")
@Inheritance(
	    strategy = InheritanceType.JOINED
	)
@JsonFilter("SedeFilter")
public class Sede implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sede_id")
	private Long id;	
	
	private String codigo;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="tipo_sede_id")
	private TipoSede tipoSede;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public TipoSede getTipoSede() {
		return tipoSede;
	}



	public void setTipoSede(TipoSede tipoSede) {
		this.tipoSede = tipoSede;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
