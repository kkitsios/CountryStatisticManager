package csm.entity;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataToSend {
	
	private List<String> selectedCountries; 
	private List<Integer> years;
	@Autowired
	private List<Metric> selectedMetrics;
	
	

	public List<Metric> getSelectedMetrics() {
		return selectedMetrics;
	}


	public void setSelectedMetrics(List<Metric> selectedMetrics) {
		this.selectedMetrics = selectedMetrics;
	}


	public List<String> getSelectedCountries() {
		return selectedCountries;
	}


	public List<Integer> getYears() {
		return years;
	}


	public void setSelectedCountries(List<String> selectedCountries) {
		this.selectedCountries = selectedCountries;
	}


	public void setYears(List<Integer> years) {
		this.years = years;
	}



	
	
	
	
	
		
	

}
