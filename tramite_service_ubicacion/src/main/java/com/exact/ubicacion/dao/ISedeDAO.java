package com.exact.ubicacion.dao;

import com.exact.ubicacion.entity.Sede;

public interface ISedeDAO {
	Sede listarSedePorCodigoArea(String codigoArea);
}
