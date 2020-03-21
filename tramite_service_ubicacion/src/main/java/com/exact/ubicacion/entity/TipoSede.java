package com.exact.ubicacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tipo_sede")
public class TipoSede implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipo_sede_id")
	private Long id;
		
	private String nombre;
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
