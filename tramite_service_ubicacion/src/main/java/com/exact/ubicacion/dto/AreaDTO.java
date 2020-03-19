package com.exact.ubicacion.dto;

import java.io.Serializable;

import com.exact.ubicacion.entity.Area;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AreaDTO implements Serializable {
	
	private Long id;
	private String codigo;
	private String nombre;
	private String sede;
	
	public AreaDTO(Area area) {
		this.id = area.getId();
		this.codigo = area.getCodigo();
		this.nombre = area.getNombre();
		this.sede = area.getSede().getNombre();
		
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
