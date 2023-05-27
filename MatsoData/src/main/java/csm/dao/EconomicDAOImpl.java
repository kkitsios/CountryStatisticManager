package csm.dao;

import java.util.*;
import java.text.DecimalFormat;

import javax.persistence.EntityManager;


import org.springframework.stereotype.Repository;

@Repository("Economic")
public class EconomicDAOImpl implements MetricsDAO {
    private final EntityManager entityManager;
	
	public EconomicDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Double> findMetricByCountryBetween(String stat, List<String> countries, int startYear, int endYear) {
		List<Double> results = new ArrayList<>(); 
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		String PREFIX = "year_";
		StringJoiner columnNames = new StringJoiner(", ");
//		StringJoiner columns = new StringJoiner(", ");
		List<String> columns = new ArrayList<>(); 
		if (startYear < 1990)
			startYear = 1990;
		
		if (startYear > 2018)
			startYear = 2018;
		
		if (endYear < 1990)
			endYear = 1990;
		
		if (endYear > 2018)
			endYear = 2018;
		
//		System.err.println(endYear);
		for (int i = startYear; i <= endYear; i++) {
//			System.err.println(i);
			columns.add(PREFIX+i);
		}
		
		
		columns.forEach(columnNames::add);
//		System.err.println(columnNames);
		
		String jpql = "SELECT " + columnNames + " FROM " + stat + " WHERE country_name IN :countries";
		
		List<Object[]> resultObjects = null;
		if (columns.size() > 1) {
			resultObjects = entityManager.createNativeQuery(jpql)
					.setParameter("countries", countries)
					.getResultList();
		} else {
			resultObjects = new ArrayList<>();
			List<Object> oneCol = entityManager.createNativeQuery(jpql)
					.setParameter("countries", countries)
					.getResultList();
			for (Object object : oneCol) {
				resultObjects.add(new Object[] {object});
			}
		}
		
		
		
		for (Object[] rowObjects : resultObjects) {
			for (Object value : rowObjects) {
				results.add(Double.parseDouble(decimalFormat.format(((Float) value).doubleValue())));
			}
		}

		
		return results;
	}

}
