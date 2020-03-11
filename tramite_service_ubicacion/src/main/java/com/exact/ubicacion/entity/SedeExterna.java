package com.exact.ubicacion.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="sede_externa")
public class SedeExterna extends Sede {
	
	
	
	@ManyToOne
	@JoinColumn(name="sede_responsable_id")
	private Sede sedeResponsable;
	
	
	
	public Sede getSedeResponsable() {
		return sedeResponsable;
	}



	public void setSedeResponsable(Sede sedeResponsable) {
		this.sedeResponsable = sedeResponsable;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
