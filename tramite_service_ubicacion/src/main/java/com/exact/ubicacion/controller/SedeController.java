package com.exact.ubicacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.ubicacion.dao.ISedeDAO;
import com.exact.ubicacion.service.SedeService;
import com.exact.ubicacion.utils.Filter;

@RestController
@RequestMapping("/sedes")
public class SedeController {

	@Autowired
	@Qualifier("SimpleSedeDAO")
	ISedeDAO simpleSedeDAO;

	SedeService sedeService;

	@GetMapping
	public ResponseEntity<String> listarSedePorCodigoArea(@RequestParam String codigoArea, @RequestParam List<String> atributos) {
		sedeService = new SedeService(simpleSedeDAO);
		Filter filter = new Filter();
		String respuestaJson = filter.filtrar(sedeService.listarSedePorCodigoArea(codigoArea), "SedeFilter", atributos);
		return new ResponseEntity<String>(respuestaJson, HttpStatus.OK);
	}

}
