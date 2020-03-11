package com.exact.ubicacion.service;

import java.util.List;

import com.exact.ubicacion.dao.IAreaDAO;
import com.exact.ubicacion.entity.Area;

public class AreaService {
	
	private IAreaDAO areadao;
	
	public AreaService (IAreaDAO areadao) {
		this.areadao = areadao;
	}
	
	public Area listarByAreaId (Long areaId) {		
		Area area = areadao.listarByAreaId(areaId);
		return area;
	}
	
	public List<Area> listarByAreasIds (List<Long> areasId) {		
		List<Area> areas = areadao.listarByAreasIds(areasId);
		return areas;
	}

}
