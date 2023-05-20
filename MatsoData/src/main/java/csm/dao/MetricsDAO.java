package csm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import csm.entity.InternationalData;
import csm.entity.InternationalDataPK;


public interface MetricsDAO{
	
	public List<Double> findMetricByCountryBetween(String stat, List<String> countries, int startYear,  int endYear);

}
