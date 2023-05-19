package csm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import csm.entity.InternationalData;
import csm.entity.InternationalDataPK;


public interface InternationalDataDao{
	
//	@Query("SELECT e.{stat} FROM international_data e WHERE e.country_name IN :countries AND e.year BETWEEN :startYear AND :endYear")
	public List<Double> findStatByCountry(String stat, List<String> countries,
										   int startYear,  int endYear);

}
