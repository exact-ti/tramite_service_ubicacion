package com.exact.ubicacion.dao;

import java.util.List;

import com.exact.ubicacion.entity.Area;


public interface IAreaDAO {
	
	Area listarByAreaId(Long areaId);

	List<Area> listarAreasByCodigos(List<String> codigosUbicaciones);

}
