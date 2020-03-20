package com.exact.ubicacion.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.ubicacion.entity.Sede;

@Repository
public interface ISedeRepository extends CrudRepository<Sede, Long> {
	
	@Query("SELECT a.sede FROM Area a WHERE a.codigo = ?1")
	Sede findByCodigoArea(String codigoArea);
	
}
