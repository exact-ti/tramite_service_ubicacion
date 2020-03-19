package com.exact.ubicacion.service;

import java.util.List;
import java.util.stream.Collectors;

import com.exact.ubicacion.dao.IAreaDAO;
import com.exact.ubicacion.dto.AreaDTO;
import com.exact.ubicacion.entity.Area;

public class AreaService {

	private IAreaDAO areadao;

	public AreaService(IAreaDAO areadao) {
		this.areadao = areadao;
	}

	public Area listarByAreaId(Long areaId) {
		Area area = areadao.listarByAreaId(areaId);
		return area;
	}

	public List<AreaDTO> listarAreasByCodigos(List<String> codigosUbicaciones) {
		List<Area> areas = areadao.listarAreasByCodigos(codigosUbicaciones);
		List<AreaDTO> areasDTOs = areas.stream().map(area -> new AreaDTO(area)).collect(Collectors.toList());
		return areasDTOs;
	}

}
