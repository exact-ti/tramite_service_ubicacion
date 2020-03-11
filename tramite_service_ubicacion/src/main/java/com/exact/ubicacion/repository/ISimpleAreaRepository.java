package com.exact.ubicacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.ubicacion.entity.Area;

@Repository
public interface ISimpleAreaRepository extends CrudRepository<Area, Long> {
	
	@Query(value="Select * from area a where a.area_id = ?1", nativeQuery = true)
	public Area findAreaByAreaId(Long areaId);

	//CrudRepository -> findAllById
	
}
