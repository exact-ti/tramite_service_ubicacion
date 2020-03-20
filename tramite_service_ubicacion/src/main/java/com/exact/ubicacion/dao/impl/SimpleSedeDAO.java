package com.exact.ubicacion.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.exact.ubicacion.dao.ISedeDAO;
import com.exact.ubicacion.entity.Sede;
import com.exact.ubicacion.repository.ISedeRepository;

@Component
@Qualifier("SimpleSedeDAO")
public class SimpleSedeDAO implements ISedeDAO {

	@Autowired
	ISedeRepository sedeRepo;
	
	@Override
	public Sede listarSedePorCodigoArea(String codigoArea) {
		return sedeRepo.findByCodigoArea(codigoArea);
	}

}
