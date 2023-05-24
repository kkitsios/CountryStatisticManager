package matso_data.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import csm.App;
import csm.dao.MetricsDAO;

@SpringBootTest(classes = App.class)
@TestPropertySource(
 locations = "classpath:application.properties")
class MetricsDAOTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	private List<String> countries = Arrays.asList(new String[] {"Greece", "Algeria"});
	private int startYear = 1990;
	private int endYear = 1992;
	@Test
	public void testEconimicFindMetricByCountryBetween() {
		Double expected[] = {0.695, 0.687, 0.687, 0.808, 0.812, 0.812}; 
		MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean("Economic");
		
		assertArrayEquals(expected, metricsDAO.findMetricByCountryBetween("income_index", countries, startYear, endYear).toArray());
		
	} 
	
	@Test
	public void testDemographicFindMetricByCountryBetween() {
		Float expected[] = {27.3f, 26.1f, 26.0f, 18.0f, 17.1f}; 
		MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean("international");
		
		assertArrayEquals(expected, metricsDAO.findMetricByCountryBetween("fertilityRate_15_19", countries, startYear, endYear).toArray());
		
	} 
	
	@Test
	public void testPopulationFindMetricByCountryBetween() {
		Integer expected[] = {360130,
				376630,
				364812,
				381520,
				371299,
				388222,
				50373,
				53081,
				49781,
				53117}; 
		MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean("population");
		
		assertArrayEquals(expected, metricsDAO.findMetricByCountryBetween("populationAge0", countries, startYear, endYear).toArray());
		
	} 
	
	@Test
	public void testCountryAreaFindMetricByCountryBetween() {
		Float expected[] = {2381740.f, 130647.f}; 
		MetricsDAO metricsDAO = (MetricsDAO) applicationContext.getBean("country_area");
		
		assertArrayEquals(expected, metricsDAO.findMetricByCountryBetween("countryArea", countries, startYear, endYear).toArray());
		
	} 



}
