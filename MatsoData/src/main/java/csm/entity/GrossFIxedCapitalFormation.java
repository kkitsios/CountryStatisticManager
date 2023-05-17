package csm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gross_fixed_capital_formation")
public class GrossFIxedCapitalFormation {
	
	//PK
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Integer countryId;

	//FK
	@ManyToOne
	private Country country;

	@Column(name = "country_name", columnDefinition = "TEXT")
    private String countryName;

    @Column(name = "year_1990")
    private Float year1990;

    @Column(name = "year_1991")
    private Float year1991;

    @Column(name = "year_1992")
    private Float year1992;

    @Column(name = "year_1993")
    private Float year1993;

    @Column(name = "year_1994")
    private Float year1994;

    @Column(name = "year_1995")
    private Float year1995;

    @Column(name = "year_1996")
    private Float year1996;

    @Column(name = "year_1997")
    private Float year1997;

    @Column(name = "year_1998")
    private Float year1998;

    @Column(name = "year_1999")
    private Float year1999;

    @Column(name = "year_2000")
    private Float year2000;

    @Column(name = "year_2001")
    private Float year2001;

    @Column(name = "year_2002")
    private Float year2002;

    @Column(name = "year_2003")
    private Float year2003;

    @Column(name = "year_2004")
    private Float year2004;

    @Column(name = "year_2005")
    private Float year2005;

    @Column(name = "year_2006")
    private Float year2006;

    @Column(name = "year_2007")
    private Float year2007;

    @Column(name = "year_2008")
    private Float year2008;

    @Column(name = "year_2009")
    private Float year2009;

    @Column(name = "year_2010")
    private Float year2010;

    @Column(name = "year_2011")
    private Float year2011;

    @Column(name = "year_2012")
    private Float year2012;

    @Column(name = "year_2013")
    private Float year2013;

    @Column(name = "year_2014")
    private Float year2014;

    @Column(name = "year_2015")
    private Float year2015;

    @Column(name = "year_2016")
    private Float year2016;

    @Column(name = "year_2017")
    private Float year2017;

    @Column(name = "year_2018")
    private Float year2018;
    
    public GrossFIxedCapitalFormation() {
		// TODO Auto-generated constructor stub
	}

    //Getters-Setters
	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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

	public Float getYear1990() {
		return year1990;
	}

	public void setYear1990(Float year1990) {
		this.year1990 = year1990;
	}

	public Float getYear1991() {
		return year1991;
	}

	public void setYear1991(Float year1991) {
		this.year1991 = year1991;
	}

	public Float getYear1992() {
		return year1992;
	}

	public void setYear1992(Float year1992) {
		this.year1992 = year1992;
	}

	public Float getYear1993() {
		return year1993;
	}

	public void setYear1993(Float year1993) {
		this.year1993 = year1993;
	}

	public Float getYear1994() {
		return year1994;
	}

	public void setYear1994(Float year1994) {
		this.year1994 = year1994;
	}

	public Float getYear1995() {
		return year1995;
	}

	public void setYear1995(Float year1995) {
		this.year1995 = year1995;
	}

	public Float getYear1996() {
		return year1996;
	}

	public void setYear1996(Float year1996) {
		this.year1996 = year1996;
	}

	public Float getYear1997() {
		return year1997;
	}

	public void setYear1997(Float year1997) {
		this.year1997 = year1997;
	}

	public Float getYear1998() {
		return year1998;
	}

	public void setYear1998(Float year1998) {
		this.year1998 = year1998;
	}

	public Float getYear1999() {
		return year1999;
	}

	public void setYear1999(Float year1999) {
		this.year1999 = year1999;
	}

	public Float getYear2000() {
		return year2000;
	}

	public void setYear2000(Float year2000) {
		this.year2000 = year2000;
	}

	public Float getYear2001() {
		return year2001;
	}

	public void setYear2001(Float year2001) {
		this.year2001 = year2001;
	}

	public Float getYear2002() {
		return year2002;
	}

	public void setYear2002(Float year2002) {
		this.year2002 = year2002;
	}

	public Float getYear2003() {
		return year2003;
	}

	public void setYear2003(Float year2003) {
		this.year2003 = year2003;
	}

	public Float getYear2004() {
		return year2004;
	}

	public void setYear2004(Float year2004) {
		this.year2004 = year2004;
	}

	public Float getYear2005() {
		return year2005;
	}

	public void setYear2005(Float year2005) {
		this.year2005 = year2005;
	}

	public Float getYear2006() {
		return year2006;
	}

	public void setYear2006(Float year2006) {
		this.year2006 = year2006;
	}

	public Float getYear2007() {
		return year2007;
	}

	public void setYear2007(Float year2007) {
		this.year2007 = year2007;
	}

	public Float getYear2008() {
		return year2008;
	}

	public void setYear2008(Float year2008) {
		this.year2008 = year2008;
	}

	public Float getYear2009() {
		return year2009;
	}

	public void setYear2009(Float year2009) {
		this.year2009 = year2009;
	}

	public Float getYear2010() {
		return year2010;
	}

	public void setYear2010(Float year2010) {
		this.year2010 = year2010;
	}

	public Float getYear2011() {
		return year2011;
	}

	public void setYear2011(Float year2011) {
		this.year2011 = year2011;
	}

	public Float getYear2012() {
		return year2012;
	}

	public void setYear2012(Float year2012) {
		this.year2012 = year2012;
	}

	public Float getYear2013() {
		return year2013;
	}

	public void setYear2013(Float year2013) {
		this.year2013 = year2013;
	}

	public Float getYear2014() {
		return year2014;
	}

	public void setYear2014(Float year2014) {
		this.year2014 = year2014;
	}

	public Float getYear2015() {
		return year2015;
	}

	public void setYear2015(Float year2015) {
		this.year2015 = year2015;
	}

	public Float getYear2016() {
		return year2016;
	}

	public void setYear2016(Float year2016) {
		this.year2016 = year2016;
	}

	public Float getYear2017() {
		return year2017;
	}

	public void setYear2017(Float year2017) {
		this.year2017 = year2017;
	}

	public Float getYear2018() {
		return year2018;
	}

	public void setYear2018(Float year2018) {
		this.year2018 = year2018;
	}
    
    

}
