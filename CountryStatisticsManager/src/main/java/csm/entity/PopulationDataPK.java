package csm.entity;
import java.io.Serializable;
import javax.persistence.Embeddable;


@Embeddable
public class PopulationDataPK implements Serializable {

	private String countryCode;
	private	Integer year;
	private	String sex;
	
	
	public PopulationDataPK() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}

}
