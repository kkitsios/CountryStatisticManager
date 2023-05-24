package csm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metric {
	
	
	private String typeOfMetric;
	
	private String nameOfMetric;
	
	
	
	public String getTypeOfMetric() {
		return typeOfMetric;
	}
	public void setTypeOfMetric(String typeOfMetric) {
		this.typeOfMetric = typeOfMetric;
	}
	public String getNameOfMetric() {
		return nameOfMetric;
	}
	public void setNameOfMetric(String nameOfMetric) {
		this.nameOfMetric = nameOfMetric;
	}
	
	

}
