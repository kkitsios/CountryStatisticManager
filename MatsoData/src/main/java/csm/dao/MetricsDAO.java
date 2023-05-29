package csm.dao;

import java.util.List;



public interface MetricsDAO{
	
	public List<Double> findMetricByCountryBetween(String stat, List<String> countries, int startYear,  int endYear);
	

}
