package com.exact.ubicacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.ubicacion.dao.IAreaDAO;
import com.exact.ubicacion.entity.Area;
import com.exact.ubicacion.service.AreaService;

@RestController
@RequestMapping("/areas")
public class AreaController {


	@Autowired
	@Qualifier ("simpleAreaDAO")
	IAreaDAO areadao;
	
	//FALTA EL AUTENTICATION //POR CONFIRMAR QUE SE VA A USAR
	
	AreaService areaservice;
	
	//LISTAR 1 SOLA ÁREA
	@GetMapping("/{id}")
	public ResponseEntity<Area> listarByAreaId(@PathVariable Long id){
		
		Long areaId = id;
		areaservice = new AreaService(areadao);
		Area area = areaservice.listarByAreaId(areaId);
		return new ResponseEntity<Area>(area, HttpStatus.OK);
	}
	
	//LISTAR MÁS DE 1 ÁREA
	@GetMapping
	public ResponseEntity<List<Area>> ListarByAreasIds(@RequestParam("ids") List<Long> areasId){		
		areaservice = new AreaService(areadao);
		return new ResponseEntity<List<Area>>(areaservice.listarByAreasIds(areasId), HttpStatus.OK);
	}

	
}
