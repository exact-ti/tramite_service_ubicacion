package com.exact.ubicacion.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.exact.ubicacion.entity.Area;
import com.exact.ubicacion.repository.ISimpleAreaRepository;

@Component
@Qualifier ("simpleAreaDAO")
public class SimpleAreaDAO implements IAreaDAO{
	
	@Autowired
	ISimpleAreaRepository simplearearepository;

	@Override
	public Area listarByAreaId(Long areaId) {
		Area area = simplearearepository.findAreaByAreaId(areaId);
		return area;
	}

	@Override
	public List<Area> listarAreasByCodigos(List<String> codigos) {
		return simplearearepository.findByCodigoIn(codigos);
		
	}

}
