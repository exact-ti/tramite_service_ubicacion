package com.exact.ubicacion.utils;

import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class Filter {
	
	public String filtrar(Object objeto, String filtro, List<String> atributos) {
		SimpleFilterProvider filterProvider = new SimpleFilterProvider();
		filterProvider.addFilter(filtro, SimpleBeanPropertyFilter.filterOutAllExcept(new HashSet<String>(atributos)));
		ObjectMapper om = new ObjectMapper();
		om.setFilterProvider(filterProvider);
		try {
			return om.writeValueAsString(objeto);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;			
		}
	}
}
