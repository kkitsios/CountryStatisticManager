package csm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	
	//PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int isoCode;

    @Column(length = 3)
    private String iso;

    @Column(length = 3)
    private String iso3;

    @Column(length = 2)
    private String fips;

    @Column(length = 100)
    private String displayName;

    @Column(length = 200)
    private String officialName;

    @Column(length = 100)
    private String capital;

    @Column(length = 50)
    private String continent;

    @Column(length = 3)
    private String currencyCode;

    @Column(length = 100)
    private String currencyName;

    @Column(length = 20)
    private String phone;

    @Column(name = "region_code", length = 5)
    private String regionCode;

    @Column(name = "region_name", length = 100)
    private String regionName;

    @Column(name = "subregion_code", length = 5)
    private String subregionCode;

    @Column(name = "subregion_name", length = 100)
    private String subregionName;

    @Column(name = "intermediate_region_code", length = 5)
    private String intermediateRegionCode;

    @Column(name = "intermediate_region_name", length = 100)
    private String intermediateRegionName;

    @Column(length = 50)
    private String status;

    @Column(name = "developed_or_developing", length = 50)
    private String developedOrDeveloping;

    @Column(name = "small_island_developing_states", length = 5)
    private String smallIslandDevelopingStates;

    @Column(name = "land_locked_developing_countries", length = 5)
    private String landLockedDevelopingCountries;

    @Column(name = "least_developed_countries", length = 5)
    private String leastDevelopedCountries;

    @Column(name = "area_sq_km")
    private float areaSqKm;

    @Column(name = "Population")
    private int population;

    public Country() {
		// TODO Auto-generated constructor stub
	}

    //Getters-Setters
	public int getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(int isoCode) {
		this.isoCode = isoCode;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getSubregionCode() {
		return subregionCode;
	}

	public void setSubregionCode(String subregionCode) {
		this.subregionCode = subregionCode;
	}

	public String getSubregionName() {
		return subregionName;
	}

	public void setSubregionName(String subregionName) {
		this.subregionName = subregionName;
	}

	public String getIntermediateRegionCode() {
		return intermediateRegionCode;
	}

	public void setIntermediateRegionCode(String intermediateRegionCode) {
		this.intermediateRegionCode = intermediateRegionCode;
	}

	public String getIntermediateRegionName() {
		return intermediateRegionName;
	}

	public void setIntermediateRegionName(String intermediateRegionName) {
		this.intermediateRegionName = intermediateRegionName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDevelopedOrDeveloping() {
		return developedOrDeveloping;
	}

	public void setDevelopedOrDeveloping(String developedOrDeveloping) {
		this.developedOrDeveloping = developedOrDeveloping;
	}

	public String getSmallIslandDevelopingStates() {
		return smallIslandDevelopingStates;
	}

	public void setSmallIslandDevelopingStates(String smallIslandDevelopingStates) {
		this.smallIslandDevelopingStates = smallIslandDevelopingStates;
	}

	public String getLandLockedDevelopingCountries() {
		return landLockedDevelopingCountries;
	}

	public void setLandLockedDevelopingCountries(String landLockedDevelopingCountries) {
		this.landLockedDevelopingCountries = landLockedDevelopingCountries;
	}

	public String getLeastDevelopedCountries() {
		return leastDevelopedCountries;
	}

	public void setLeastDevelopedCountries(String leastDevelopedCountries) {
		this.leastDevelopedCountries = leastDevelopedCountries;
	}

	public float getAreaSqKm() {
		return areaSqKm;
	}

	public void setAreaSqKm(float areaSqKm) {
		this.areaSqKm = areaSqKm;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
    
    
}
