package com.exact.ubicacion.service;

import com.exact.ubicacion.dao.ISedeDAO;
import com.exact.ubicacion.entity.Sede;

public class SedeService {
	
	ISedeDAO sedeDAO;
	
	public SedeService(ISedeDAO sedeDAO) {
		this.sedeDAO = sedeDAO;
	}
	
	public Sede listarSedePorCodigoArea(String codigoArea) {
		return sedeDAO.listarSedePorCodigoArea(codigoArea);
	}
	
}
