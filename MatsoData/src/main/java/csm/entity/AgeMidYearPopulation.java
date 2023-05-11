package csm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "your_table_name")
public class AgeMidYearPopulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_code", length = 3, nullable = false)
    private String countryCode;

    @Column(name = "country_name", length = 255, nullable = false)
    private String countryName;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "total_flag", length = 1)
    private String totalFlag;

    @Column(name = "starting_age")
    private Integer startingAge;

    @Column(name = "age_group_indicator", length = 1)
    private String ageGroupIndicator;

    @Column(name = "ending_age")
    private Integer endingAge;

    @Column(name = "5yr_age_midyear_population")
    private Float ageMidyearPopulation;
    
    @Column(name = "5yr_age_midyear_population_female")
    private Float ageMidyearPopulationFemale;
    
    @Column(name = "5yr_age_midyear_population_male")
    private Float ageMidyearPopulationmale;
    
    public AgeMidYearPopulation() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTotalFlag() {
		return totalFlag;
	}

	public void setTotalFlag(String totalFlag) {
		this.totalFlag = totalFlag;
	}

	public Integer getStartingAge() {
		return startingAge;
	}

	public void setStartingAge(Integer startingAge) {
		this.startingAge = startingAge;
	}

	public String getAgeGroupIndicator() {
		return ageGroupIndicator;
	}

	public void setAgeGroupIndicator(String ageGroupIndicator) {
		this.ageGroupIndicator = ageGroupIndicator;
	}

	public Integer getEndingAge() {
		return endingAge;
	}

	public void setEndingAge(Integer endingAge) {
		this.endingAge = endingAge;
	}

	public Float getAgeMidyearPopulation() {
		return ageMidyearPopulation;
	}

	public void setAgeMidyearPopulation(Float ageMidyearPopulation) {
		this.ageMidyearPopulation = ageMidyearPopulation;
	}

	public Float getAgeMidyearPopulationFemale() {
		return ageMidyearPopulationFemale;
	}

	public void setAgeMidyearPopulationFemale(Float ageMidyearPopulationFemale) {
		this.ageMidyearPopulationFemale = ageMidyearPopulationFemale;
	}

	public Float getAgeMidyearPopulationmale() {
		return ageMidyearPopulationmale;
	}

	public void setAgeMidyearPopulationmale(Float ageMidyearPopulationmale) {
		this.ageMidyearPopulationmale = ageMidyearPopulationmale;
	}
    
    
}
