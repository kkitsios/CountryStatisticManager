package csm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


//@Entity
@Table(name = "international_data")
public class InternationalData {
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "year")
	private int year;
	
	
	
	@Column(name = "fertility_rate_15_19")
	private float fertilityRate_15_19;
	
	@Column(name = "fertility_rate_20_24")
	private float fertilityRate_20_24;
	
	@Column(name = "fertility_rate_25_29")
	private float fertilityRate_25_29;
	
	@Column(name = "fertility_rate_30_34")
	private float fertilityRate_30_34;
	
	@Column(name = "fertility_rate_35_39")
	private float fertilityRate_35_39;
	
	@Column(name = "fertility_rate_40_44")
	private float fertilityRate_40_44;
	
	@Column(name = "fertility_rate_45_49")
	private float fertilityRate_45_49;
	
	@Column(name = "crude_birth_rate")
	private float crudeBirthRate;
	
	@Column(name = "crude_death_rate")
	private float crudeDeathRate;
	
	@Column(name = "gross_reproduction_rate")
	private float grossReproductioRrate;
	
	@Column(name = "growth_rate")
	private float growthRate;
	
	@Column(name = "infant_mortality")
	private float infantMortality;
	
	@Column(name = "infant_mortality_female")
	private float infantMortalityFemale;
	
	@Column(name = "infant_mortality_male")
	private float infantMortalityMale;
	
	@Column(name = "life_expectancy")
	private float lifeExpectancy;
	
	@Column(name = "life_expectancy_female")
	private float lifeExpectancyFemale;
	
	@Column(name = "life_expectancy_male")
	private float lifeExpectancyMale;
	
	@Column(name = "midyear_population")
	private float midyearPopulation;
	
	@Column(name = "mortality_rate_1to4")
	private float mortalityRateOneToFour;
	
	@Column(name = "mortality_rate_1to4_female")
	private float mortalityRateOneToFourFemale;
	
	@Column(name = "mortality_rate_1to4_male")
	private float mortalityRateOneToFourMale;
	
	@Column(name = "mortality_rate_under5")
	private float mortalityRateUnderFive;
	
	@Column(name = "mortality_rate_under5_female")
	private float mortalityRateUnderFiveFemale;
	
	@Column(name = "mortality_rate_under5_male")
	private float mortalityRateUnderFiveMale;
	
	@Column(name = "net_migration")
	private float netMigration;
	
	@Column(name = "sex_ratio_at_birth")
	private float sexRatioAtBirth;
	
	@Column(name = "total_fertility_rate")
	private float totalFertilityRate;
	
	@Column(name = "rate_natural_increase")
	private float rateNaturalIncrease;
	
	public InternationalData() {
		// TODO Auto-generated constructor stub
	}
	
    //Getters-Setters
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getFertilityRate_15_19() {
		return fertilityRate_15_19;
	}
	public void setFertilityRate_15_19(float fertilityRate_15_19) {
		this.fertilityRate_15_19 = fertilityRate_15_19;
	}
	public float getFertilityRate_20_24() {
		return fertilityRate_20_24;
	}
	public void setFertilityRate_20_24(float fertilityRate_20_24) {
		this.fertilityRate_20_24 = fertilityRate_20_24;
	}
	public float getFertilityRate_25_29() {
		return fertilityRate_25_29;
	}
	public void setFertilityRate_25_29(float fertilityRate_25_29) {
		this.fertilityRate_25_29 = fertilityRate_25_29;
	}
	public float getFertilityRate_30_34() {
		return fertilityRate_30_34;
	}
	public void setFertilityRate_30_34(float fertilityRate_30_34) {
		this.fertilityRate_30_34 = fertilityRate_30_34;
	}
	public float getFertilityRate_35_39() {
		return fertilityRate_35_39;
	}
	public void setFertilityRate_35_39(float fertilityRate_35_39) {
		this.fertilityRate_35_39 = fertilityRate_35_39;
	}
	public float getFertilityRate_40_44() {
		return fertilityRate_40_44;
	}
	public void setFertilityRate_40_44(float fertilityRate_40_44) {
		this.fertilityRate_40_44 = fertilityRate_40_44;
	}
	public float getFertilityRate_45_49() {
		return fertilityRate_45_49;
	}
	public void setFertilityRate_45_49(float fertilityRate_45_49) {
		this.fertilityRate_45_49 = fertilityRate_45_49;
	}
	public float getCrudeBirthRate() {
		return crudeBirthRate;
	}
	public void setCrudeBirthRate(float crudeBirthRate) {
		this.crudeBirthRate = crudeBirthRate;
	}
	public float getCrudeDeathRate() {
		return crudeDeathRate;
	}
	public void setCrudeDeathRate(float crudeDeathRate) {
		this.crudeDeathRate = crudeDeathRate;
	}
	public float getGrossReproductioRrate() {
		return grossReproductioRrate;
	}
	public void setGrossReproductioRrate(float grossReproductioRrate) {
		this.grossReproductioRrate = grossReproductioRrate;
	}
	public float getGrowthRate() {
		return growthRate;
	}
	public void setGrowthRate(float growthRate) {
		this.growthRate = growthRate;
	}
	public float getInfantMortality() {
		return infantMortality;
	}
	public void setInfantMortality(float infantMortality) {
		this.infantMortality = infantMortality;
	}
	public float getInfantMortalityFemale() {
		return infantMortalityFemale;
	}
	public void setInfantMortalityFemale(float infantMortalityFemale) {
		this.infantMortalityFemale = infantMortalityFemale;
	}
	public float getInfantMortalityMale() {
		return infantMortalityMale;
	}
	public void setInfantMortalityMale(float infantMortalityMale) {
		this.infantMortalityMale = infantMortalityMale;
	}
	public float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public float getLifeExpectancyFemale() {
		return lifeExpectancyFemale;
	}
	public void setLifeExpectancyFemale(float lifeExpectancyFemale) {
		this.lifeExpectancyFemale = lifeExpectancyFemale;
	}
	public float getLifeExpectancyMale() {
		return lifeExpectancyMale;
	}
	public void setLifeExpectancyMale(float lifeExpectancyMale) {
		this.lifeExpectancyMale = lifeExpectancyMale;
	}
	public float getMidyearPopulation() {
		return midyearPopulation;
	}
	public void setMidyearPopulation(float midyearPopulation) {
		this.midyearPopulation = midyearPopulation;
	}
	public float getMortalityRateOneToFour() {
		return mortalityRateOneToFour;
	}
	public void setMortalityRateOneToFour(float mortalityRateOneToFour) {
		this.mortalityRateOneToFour = mortalityRateOneToFour;
	}
	public float getMortalityRateOneToFourFemale() {
		return mortalityRateOneToFourFemale;
	}
	public void setMortalityRateOneToFourFemale(float mortalityRateOneToFourFemale) {
		this.mortalityRateOneToFourFemale = mortalityRateOneToFourFemale;
	}
	public float getMortalityRateOneToFourMale() {
		return mortalityRateOneToFourMale;
	}
	public void setMortalityRateOneToFourMale(float mortalityRateOneToFourMale) {
		this.mortalityRateOneToFourMale = mortalityRateOneToFourMale;
	}
	public float getMortalityRateUnderFive() {
		return mortalityRateUnderFive;
	}
	public void setMortalityRateUnderFive(float mortalityRateUnderFive) {
		this.mortalityRateUnderFive = mortalityRateUnderFive;
	}
	public float getMortalityRateUnderFiveFemale() {
		return mortalityRateUnderFiveFemale;
	}
	public void setMortalityRateUnderFiveFemale(float mortalityRateUnderFiveFemale) {
		this.mortalityRateUnderFiveFemale = mortalityRateUnderFiveFemale;
	}
	public float getMortalityRateUnderFiveMale() {
		return mortalityRateUnderFiveMale;
	}
	public void setMortalityRateUnderFiveMale(float mortalityRateUnderFiveMale) {
		this.mortalityRateUnderFiveMale = mortalityRateUnderFiveMale;
	}
	public float getNetMigration() {
		return netMigration;
	}
	public void setNetMigration(float netMigration) {
		this.netMigration = netMigration;
	}
	public float getSexRatioAtBirth() {
		return sexRatioAtBirth;
	}
	public void setSexRatioAtBirth(float sexRatioAtBirth) {
		this.sexRatioAtBirth = sexRatioAtBirth;
	}
	public float getTotalFertilityRate() {
		return totalFertilityRate;
	}
	public void setTotalFertilityRate(float totalFertilityRate) {
		this.totalFertilityRate = totalFertilityRate;
	}
	public float getRateNaturalIncrease() {
		return rateNaturalIncrease;
	}
	public void setRateNaturalIncrease(float rateNaturalIncrease) {
		this.rateNaturalIncrease = rateNaturalIncrease;
	}
	
	

}
