package csm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries_area")
public class CountryArea {

	//PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String countryCode;

    //FK
	@ManyToOne
	private Country country;
	
	
	@Column(name = "country_name", length = 255)
    private String countryName;

    @Column(name = "country_area")
    private Float countryArea;
    
    public CountryArea() {
		// TODO Auto-generated constructor stub
	}
    
    //Getters-Setters
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Float getCountryArea() {
		return countryArea;
	}

	public void setCountryArea(Float countryArea) {
		this.countryArea = countryArea;
	}
   
}