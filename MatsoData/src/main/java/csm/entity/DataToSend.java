package csm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class DataToSend {
	private List<String> selectedMetrics; 
	private List<String> selectedCountries; 
	private List<Integer> years;  
	private List<String> typeOfMetrics;
	
	
	


	public List<String> getSelectedMetrics() {
		return selectedMetrics;
	}


	public List<String> getSelectedCountries() {
		return selectedCountries;
	}


	public List<Integer> getYears() {
		return years;
	}


	public List<String> getTypeOfMetrics() {
		return typeOfMetrics;
	}


	public void setSelectedMetrics(List<String> selectedMetrics) {
		this.selectedMetrics = selectedMetrics;
	}


	public void setSelectedCountries(List<String> selectedCountries) {
		this.selectedCountries = selectedCountries;
	}


	public void setYears(List<Integer> years) {
		this.years = years;
	}


	public void setTypeOfMetrics(List<String> typeOfMetrics) {
		this.typeOfMetrics = typeOfMetrics;
	}
	
	
	
	
	
		
	

}
