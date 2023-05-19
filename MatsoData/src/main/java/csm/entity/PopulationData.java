package csm.entity;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "midyear_population_age_sex")
public class PopulationData {
	
	//PK
	@EmbeddedId
	private PopulationDataPK id;

	//FK
  	@ManyToOne
  	private Country country;
  	
//    @Column(name = "country_code", length = 3, nullable = false)
//    private String countryCode;

    @Column(name = "country_name", length = 50)
    private String countryName;

//    @Column(name = "year", nullable = false)
//    private Integer year;

//    @Column(name = "sex", length = 10)
//    private String sex;

    @Column(name = "max_age", nullable = false)
    private Integer maxAge;

    @Column(name = "population_age_0")
    private Integer populationAge0;

    @Column(name = "population_age_1")
    private Integer populationAge1;

    @Column(name = "population_age_2")
    private Integer populationAge2;

    @Column(name = "population_age_3")
    private Integer populationAge3;

    @Column(name = "population_age_4")
    private Integer populationAge4;

    @Column(name = "population_age_5")
    private Integer populationAge5;
    
    @Column(name = "population_age_6")
    private Integer populationAge6;

    @Column(name = "population_age_7")
    private Integer populationAge7;

    @Column(name = "population_age_8")
    private Integer populationAge8;
    
    @Column(name = "population_age_9")
    private Integer populationAge9;
    
    @Column(name = "population_age_10")
    private Integer populationAge10;
    
    @Column(name = "population_age_11")
    private Integer populationAge11;
    
    @Column(name = "population_age_12")
    private Integer populationAge12;
    
    @Column(name = "population_age_13")
    private Integer populationAge13;
    
    @Column(name = "population_age_14")
    private Integer populationAge14;
    
    @Column(name = "population_age_15")
    private Integer populationAge15;
    
    @Column(name = "population_age_16")
    private Integer populationAge16;
    
    @Column(name = "population_age_17")
    private Integer populationAge17;
    
    @Column(name = "population_age_18")
    private Integer populationAge18;
    
    @Column(name = "population_age_19")
    private Integer populationAge19;
    
    @Column(name = "population_age_20")
    private Integer populationAge20;
    
    
    @Column(name = "population_age_21")
    private Integer populationAge21;

    @Column(name = "population_age_22")
    private Integer populationAge22;

    @Column(name = "population_age_23")
    private Integer populationAge23;

    @Column(name = "population_age_24")
    private Integer populationAge24;

    @Column(name = "population_age_25")
    private Integer populationAge25;

    @Column(name = "population_age_26")
    private Integer populationAge26;

    @Column(name = "population_age_27")
    private Integer populationAge27;

    @Column(name = "population_age_28")
    private Integer populationAge28;

    @Column(name = "population_age_29")
    private Integer populationAge29;

    @Column(name = "population_age_30")
    private Integer populationAge30;

    @Column(name = "population_age_31")
    private Integer populationAge31;

    @Column(name = "population_age_32")
    private Integer populationAge32;

    @Column(name = "population_age_33")
    private Integer populationAge33;

    @Column(name = "population_age_34")
    private Integer populationAge34;

    @Column(name = "population_age_35")
    private Integer populationAge35;

    @Column(name = "population_age_36")
    private Integer populationAge36;

    @Column(name = "population_age_37")
    private Integer populationAge37;

    @Column(name = "population_age_38")
    private Integer populationAge38;

    @Column(name = "population_age_39")
    private Integer populationAge39;

    @Column(name = "population_age_40")
    private Integer populationAge40;

    @Column(name = "population_age_41")
    private Integer populationAge41;

    @Column(name = "population_age_42")
    private Integer populationAge42;

    @Column(name = "population_age_43")
    private Integer populationAge43;

    @Column(name = "population_age_44")
    private Integer populationAge44;

    @Column(name = "population_age_45")
    private Integer populationAge45;
    
    @Column(name = "population_age_46")
    private Integer populationAge46;
    
    @Column(name = "population_age_47")
    private Integer populationAge47;

    @Column(name = "population_age_48")
    private Integer populationAge48;

    @Column(name = "population_age_49")
    private Integer populationAge49;

    @Column(name = "population_age_50")
    private Integer populationAge50;

    @Column(name = "population_age_51")
    private Integer populationAge51;

    @Column(name = "population_age_52")
    private Integer populationAge52;

    @Column(name = "population_age_53")
    private Integer populationAge53;

    @Column(name = "population_age_54")
    private Integer populationAge54;

    @Column(name = "population_age_55")
    private Integer populationAge55;

    @Column(name = "population_age_56")
    private Integer populationAge56;

    @Column(name = "population_age_57")
    private Integer populationAge57;

    @Column(name = "population_age_58")
    private Integer populationAge58;

    @Column(name = "population_age_59")
    private Integer populationAge59;

    @Column(name = "population_age_60")
    private Integer populationAge60;

    @Column(name = "population_age_61")
    private Integer populationAge61;
    
    @Column(name = "population_age_62")
    private Integer populationAge62;

    @Column(name = "population_age_63")
    private Integer populationAge63;

    @Column(name = "population_age_64")
    private Integer populationAge64;

    @Column(name = "population_age_65")
    private Integer populationAge65;

    @Column(name = "population_age_66")
    private Integer populationAge66;

    @Column(name = "population_age_67")
    private Integer populationAge67;

    @Column(name = "population_age_68")
    private Integer populationAge68;

    @Column(name = "population_age_69")
    private Integer populationAge69;

    @Column(name = "population_age_70")
    private Integer populationAge70;

    @Column(name = "population_age_71")
    private Integer populationAge71;

    @Column(name = "population_age_72")
    private Integer populationAge72;

    @Column(name = "population_age_73")
    private Integer populationAge73;

    @Column(name = "population_age_74")
    private Integer populationAge74;

    @Column(name = "population_age_75")
    private Integer populationAge75;

    @Column(name = "population_age_76")
    private Integer populationAge76;

    @Column(name = "population_age_77")
    private Integer populationAge77;

    @Column(name = "population_age_78")
    private Integer populationAge78;

    @Column(name = "population_age_79")
    private Integer populationAge79;

    @Column(name = "population_age_80")
    private Integer populationAge80;

    @Column(name = "population_age_81")
    private Integer populationAge81;

    @Column(name = "population_age_82")
    private Integer populationAge82;

    @Column(name = "population_age_83")
    private Integer populationAge83;
    
    @Column(name = "population_age_84")
    private Integer populationAge84;

    @Column(name = "population_age_85")
    private Integer populationAge85;

    @Column(name = "population_age_86")
    private Integer populationAge86;

    @Column(name = "population_age_87")
    private Integer populationAge87;

    @Column(name = "population_age_88")
    private Integer populationAge88;

    @Column(name = "population_age_89")
    private Integer populationAge89;

    @Column(name = "population_age_90")
    private Integer populationAge90;

    @Column(name = "population_age_91")
    private Integer populationAge91;

    @Column(name = "population_age_92")
    private Integer populationAge92;

    @Column(name = "population_age_93")
    private Integer populationAge93;

    @Column(name = "population_age_94")
    private Integer populationAge94;

    @Column(name = "population_age_95")
    private Integer populationAge95;

    @Column(name = "population_age_96")
    private Integer populationAge96;

    @Column(name = "population_age_97")
    private Integer populationAge97;
    
    @Column(name = "population_age_98")
    private Integer populationAge98;

    @Column(name = "population_age_99")
    private Integer populationAge99;

    @Column(name = "population_age_100")
    private Integer populationAge100;

    // Default constructor (required by JPA)
    public PopulationData() {
    }

    // Getters and setters
    public PopulationDataPK getId() {
		return id;
	}

	public void setId(PopulationDataPK id) {
		this.id = id;
	}
    
    public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }

//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

	public Integer getPopulationAge0() {
		return populationAge0;
	}

	public void setPopulationAge0(Integer populationAge0) {
		this.populationAge0 = populationAge0;
	}

	public Integer getPopulationAge1() {
		return populationAge1;
	}

	public void setPopulationAge1(Integer populationAge1) {
		this.populationAge1 = populationAge1;
	}

	public Integer getPopulationAge2() {
		return populationAge2;
	}

	public void setPopulationAge2(Integer populationAge2) {
		this.populationAge2 = populationAge2;
	}

	public Integer getPopulationAge3() {
		return populationAge3;
	}

	public void setPopulationAge3(Integer populationAge3) {
		this.populationAge3 = populationAge3;
	}

	public Integer getPopulationAge4() {
		return populationAge4;
	}

	public void setPopulationAge4(Integer populationAge4) {
		this.populationAge4 = populationAge4;
	}

	public Integer getPopulationAge5() {
		return populationAge5;
	}

	public void setPopulationAge5(Integer populationAge5) {
		this.populationAge5 = populationAge5;
	}

	public Integer getPopulationAge6() {
		return populationAge6;
	}

	public void setPopulationAge6(Integer populationAge6) {
		this.populationAge6 = populationAge6;
	}

	public Integer getPopulationAge7() {
		return populationAge7;
	}

	public void setPopulationAge7(Integer populationAge7) {
		this.populationAge7 = populationAge7;
	}

	public Integer getPopulationAge8() {
		return populationAge8;
	}

	public void setPopulationAge8(Integer populationAge8) {
		this.populationAge8 = populationAge8;
	}

	public Integer getPopulationAge9() {
		return populationAge9;
	}

	public void setPopulationAge9(Integer populationAge9) {
		this.populationAge9 = populationAge9;
	}

	public Integer getPopulationAge10() {
		return populationAge10;
	}

	public void setPopulationAge10(Integer populationAge10) {
		this.populationAge10 = populationAge10;
	}

	public Integer getPopulationAge11() {
		return populationAge11;
	}

	public void setPopulationAge11(Integer populationAge11) {
		this.populationAge11 = populationAge11;
	}

	public Integer getPopulationAge12() {
		return populationAge12;
	}

	public void setPopulationAge12(Integer populationAge12) {
		this.populationAge12 = populationAge12;
	}

	public Integer getPopulationAge13() {
		return populationAge13;
	}

	public void setPopulationAge13(Integer populationAge13) {
		this.populationAge13 = populationAge13;
	}

	public Integer getPopulationAge14() {
		return populationAge14;
	}

	public void setPopulationAge14(Integer populationAge14) {
		this.populationAge14 = populationAge14;
	}

	public Integer getPopulationAge15() {
		return populationAge15;
	}

	public void setPopulationAge15(Integer populationAge15) {
		this.populationAge15 = populationAge15;
	}

	public Integer getPopulationAge16() {
		return populationAge16;
	}

	public void setPopulationAge16(Integer populationAge16) {
		this.populationAge16 = populationAge16;
	}

	public Integer getPopulationAge17() {
		return populationAge17;
	}

	public void setPopulationAge17(Integer populationAge17) {
		this.populationAge17 = populationAge17;
	}

	public Integer getPopulationAge18() {
		return populationAge18;
	}

	public void setPopulationAge18(Integer populationAge18) {
		this.populationAge18 = populationAge18;
	}

	public Integer getPopulationAge19() {
		return populationAge19;
	}

	public void setPopulationAge19(Integer populationAge19) {
		this.populationAge19 = populationAge19;
	}

	public Integer getPopulationAge20() {
		return populationAge20;
	}

	public void setPopulationAge20(Integer populationAge20) {
		this.populationAge20 = populationAge20;
	}

	public Integer getPopulationAge21() {
		return populationAge21;
	}

	

	public void setPopulationAge21(Integer populationAge21) {
		this.populationAge21 = populationAge21;
	}

	public Integer getPopulationAge22() {
		return populationAge22;
	}

	public void setPopulationAge22(Integer populationAge22) {
		this.populationAge22 = populationAge22;
	}

	public Integer getPopulationAge23() {
		return populationAge23;
	}

	public void setPopulationAge23(Integer populationAge23) {
		this.populationAge23 = populationAge23;
	}

	public Integer getPopulationAge24() {
		return populationAge24;
	}

	public void setPopulationAge24(Integer populationAge24) {
		this.populationAge24 = populationAge24;
	}

	public Integer getPopulationAge25() {
		return populationAge25;
	}

	public void setPopulationAge25(Integer populationAge25) {
		this.populationAge25 = populationAge25;
	}

	public Integer getPopulationAge26() {
		return populationAge26;
	}

	public void setPopulationAge26(Integer populationAge26) {
		this.populationAge26 = populationAge26;
	}

	public Integer getPopulationAge27() {
		return populationAge27;
	}

	public void setPopulationAge27(Integer populationAge27) {
		this.populationAge27 = populationAge27;
	}

	public Integer getPopulationAge28() {
		return populationAge28;
	}

	public void setPopulationAge28(Integer populationAge28) {
		this.populationAge28 = populationAge28;
	}

	public Integer getPopulationAge29() {
		return populationAge29;
	}

	public void setPopulationAge29(Integer populationAge29) {
		this.populationAge29 = populationAge29;
	}

	public Integer getPopulationAge30() {
		return populationAge30;
	}

	public void setPopulationAge30(Integer populationAge30) {
		this.populationAge30 = populationAge30;
	}

	public Integer getPopulationAge31() {
		return populationAge31;
	}

	public void setPopulationAge31(Integer populationAge31) {
		this.populationAge31 = populationAge31;
	}

	public Integer getPopulationAge32() {
		return populationAge32;
	}

	public void setPopulationAge32(Integer populationAge32) {
		this.populationAge32 = populationAge32;
	}

	public Integer getPopulationAge33() {
		return populationAge33;
	}

	public void setPopulationAge33(Integer populationAge33) {
		this.populationAge33 = populationAge33;
	}

	public Integer getPopulationAge34() {
		return populationAge34;
	}

	public void setPopulationAge34(Integer populationAge34) {
		this.populationAge34 = populationAge34;
	}

	public Integer getPopulationAge35() {
		return populationAge35;
	}

	public void setPopulationAge35(Integer populationAge35) {
		this.populationAge35 = populationAge35;
	}

	public Integer getPopulationAge36() {
		return populationAge36;
	}

	public void setPopulationAge36(Integer populationAge36) {
		this.populationAge36 = populationAge36;
	}

	public Integer getPopulationAge37() {
		return populationAge37;
	}

	public void setPopulationAge37(Integer populationAge37) {
		this.populationAge37 = populationAge37;
	}

	public Integer getPopulationAge38() {
		return populationAge38;
	}

	public void setPopulationAge38(Integer populationAge38) {
		this.populationAge38 = populationAge38;
	}

	public Integer getPopulationAge39() {
		return populationAge39;
	}

	public void setPopulationAge39(Integer populationAge39) {
		this.populationAge39 = populationAge39;
	}

	public Integer getPopulationAge40() {
		return populationAge40;
	}

	public void setPopulationAge40(Integer populationAge40) {
		this.populationAge40 = populationAge40;
	}

	public Integer getPopulationAge41() {
		return populationAge41;
	}

	public void setPopulationAge41(Integer populationAge41) {
		this.populationAge41 = populationAge41;
	}

	public Integer getPopulationAge42() {
		return populationAge42;
	}

	public void setPopulationAge42(Integer populationAge42) {
		this.populationAge42 = populationAge42;
	}

	public Integer getPopulationAge43() {
		return populationAge43;
	}

	public void setPopulationAge43(Integer populationAge43) {
		this.populationAge43 = populationAge43;
	}

	public Integer getPopulationAge44() {
		return populationAge44;
	}

	public void setPopulationAge44(Integer populationAge44) {
		this.populationAge44 = populationAge44;
	}

	public Integer getPopulationAge45() {
		return populationAge45;
	}

	public void setPopulationAge45(Integer populationAge45) {
		this.populationAge45 = populationAge45;
	}

	public Integer getPopulationAge46() {
		return populationAge46;
	}

	public void setPopulationAge46(Integer populationAge46) {
		this.populationAge46 = populationAge46;
	}

	public Integer getPopulationAge47() {
		return populationAge47;
	}

	public void setPopulationAge47(Integer populationAge47) {
		this.populationAge47 = populationAge47;
	}

	public Integer getPopulationAge48() {
		return populationAge48;
	}

	public void setPopulationAge48(Integer populationAge48) {
		this.populationAge48 = populationAge48;
	}

	public Integer getPopulationAge49() {
		return populationAge49;
	}

	public void setPopulationAge49(Integer populationAge49) {
		this.populationAge49 = populationAge49;
	}

	public Integer getPopulationAge50() {
		return populationAge50;
	}

	public void setPopulationAge50(Integer populationAge50) {
		this.populationAge50 = populationAge50;
	}

	public Integer getPopulationAge51() {
		return populationAge51;
	}

	public void setPopulationAge51(Integer populationAge51) {
		this.populationAge51 = populationAge51;
	}

	public Integer getPopulationAge52() {
		return populationAge52;
	}

	public void setPopulationAge52(Integer populationAge52) {
		this.populationAge52 = populationAge52;
	}

	public Integer getPopulationAge53() {
		return populationAge53;
	}

	public void setPopulationAge53(Integer populationAge53) {
		this.populationAge53 = populationAge53;
	}

	public Integer getPopulationAge54() {
		return populationAge54;
	}

	public void setPopulationAge54(Integer populationAge54) {
		this.populationAge54 = populationAge54;
	}

	public Integer getPopulationAge55() {
		return populationAge55;
	}

	public void setPopulationAge55(Integer populationAge55) {
		this.populationAge55 = populationAge55;
	}

	public Integer getPopulationAge56() {
		return populationAge56;
	}

	public void setPopulationAge56(Integer populationAge56) {
		this.populationAge56 = populationAge56;
	}

	public Integer getPopulationAge57() {
		return populationAge57;
	}

	public void setPopulationAge57(Integer populationAge57) {
		this.populationAge57 = populationAge57;
	}

	public Integer getPopulationAge58() {
		return populationAge58;
	}

	public void setPopulationAge58(Integer populationAge58) {
		this.populationAge58 = populationAge58;
	}

	public Integer getPopulationAge59() {
		return populationAge59;
	}

	public void setPopulationAge59(Integer populationAge59) {
		this.populationAge59 = populationAge59;
	}

	public Integer getPopulationAge60() {
		return populationAge60;
	}

	public void setPopulationAge60(Integer populationAge60) {
		this.populationAge60 = populationAge60;
	}

	public Integer getPopulationAge61() {
		return populationAge61;
	}

	public void setPopulationAge61(Integer populationAge61) {
		this.populationAge61 = populationAge61;
	}

	public Integer getPopulationAge62() {
		return populationAge62;
	}

	public void setPopulationAge62(Integer populationAge62) {
		this.populationAge62 = populationAge62;
	}

	public Integer getPopulationAge63() {
		return populationAge63;
	}

	public void setPopulationAge63(Integer populationAge63) {
		this.populationAge63 = populationAge63;
	}

	public Integer getPopulationAge64() {
		return populationAge64;
	}

	public void setPopulationAge64(Integer populationAge64) {
		this.populationAge64 = populationAge64;
	}

	public Integer getPopulationAge65() {
		return populationAge65;
	}

	public void setPopulationAge65(Integer populationAge65) {
		this.populationAge65 = populationAge65;
	}

	public Integer getPopulationAge66() {
		return populationAge66;
	}

	public void setPopulationAge66(Integer populationAge66) {
		this.populationAge66 = populationAge66;
	}

	public Integer getPopulationAge67() {
		return populationAge67;
	}

	public void setPopulationAge67(Integer populationAge67) {
		this.populationAge67 = populationAge67;
	}

	public Integer getPopulationAge68() {
		return populationAge68;
	}

	public void setPopulationAge68(Integer populationAge68) {
		this.populationAge68 = populationAge68;
	}

	public Integer getPopulationAge69() {
		return populationAge69;
	}

	public void setPopulationAge69(Integer populationAge69) {
		this.populationAge69 = populationAge69;
	}

	public Integer getPopulationAge70() {
		return populationAge70;
	}

	public void setPopulationAge70(Integer populationAge70) {
		this.populationAge70 = populationAge70;
	}

	public Integer getPopulationAge71() {
		return populationAge71;
	}

	public void setPopulationAge71(Integer populationAge71) {
		this.populationAge71 = populationAge71;
	}

	public Integer getPopulationAge72() {
		return populationAge72;
	}

	public void setPopulationAge72(Integer populationAge72) {
		this.populationAge72 = populationAge72;
	}

	public Integer getPopulationAge73() {
		return populationAge73;
	}

	public void setPopulationAge73(Integer populationAge73) {
		this.populationAge73 = populationAge73;
	}

	public Integer getPopulationAge74() {
		return populationAge74;
	}

	public void setPopulationAge74(Integer populationAge74) {
		this.populationAge74 = populationAge74;
	}

	public Integer getPopulationAge75() {
		return populationAge75;
	}

	public void setPopulationAge75(Integer populationAge75) {
		this.populationAge75 = populationAge75;
	}

	public Integer getPopulationAge76() {
		return populationAge76;
	}

	public void setPopulationAge76(Integer populationAge76) {
		this.populationAge76 = populationAge76;
	}

	public Integer getPopulationAge77() {
		return populationAge77;
	}

	public void setPopulationAge77(Integer populationAge77) {
		this.populationAge77 = populationAge77;
	}

	public Integer getPopulationAge78() {
		return populationAge78;
	}

	public void setPopulationAge78(Integer populationAge78) {
		this.populationAge78 = populationAge78;
	}

	public Integer getPopulationAge79() {
		return populationAge79;
	}

	public void setPopulationAge79(Integer populationAge79) {
		this.populationAge79 = populationAge79;
	}

	public Integer getPopulationAge80() {
		return populationAge80;
	}

	public void setPopulationAge80(Integer populationAge80) {
		this.populationAge80 = populationAge80;
	}

	public Integer getPopulationAge81() {
		return populationAge81;
	}

	public void setPopulationAge81(Integer populationAge81) {
		this.populationAge81 = populationAge81;
	}

	public Integer getPopulationAge82() {
		return populationAge82;
	}

	public void setPopulationAge82(Integer populationAge82) {
		this.populationAge82 = populationAge82;
	}

	public Integer getPopulationAge83() {
		return populationAge83;
	}

	public void setPopulationAge83(Integer populationAge83) {
		this.populationAge83 = populationAge83;
	}

	public Integer getPopulationAge84() {
		return populationAge84;
	}

	public void setPopulationAge84(Integer populationAge84) {
		this.populationAge84 = populationAge84;
	}

	public Integer getPopulationAge85() {
		return populationAge85;
	}

	public void setPopulationAge85(Integer populationAge85) {
		this.populationAge85 = populationAge85;
	}

	public Integer getPopulationAge86() {
		return populationAge86;
	}

	public void setPopulationAge86(Integer populationAge86) {
		this.populationAge86 = populationAge86;
	}

	public Integer getPopulationAge87() {
		return populationAge87;
	}

	public void setPopulationAge87(Integer populationAge87) {
		this.populationAge87 = populationAge87;
	}

	public Integer getPopulationAge88() {
		return populationAge88;
	}

	public void setPopulationAge88(Integer populationAge88) {
		this.populationAge88 = populationAge88;
	}

	public Integer getPopulationAge89() {
		return populationAge89;
	}

	public void setPopulationAge89(Integer populationAge89) {
		this.populationAge89 = populationAge89;
	}

	public Integer getPopulationAge90() {
		return populationAge90;
	}

	public void setPopulationAge90(Integer populationAge90) {
		this.populationAge90 = populationAge90;
	}

	public Integer getPopulationAge91() {
		return populationAge91;
	}

	public void setPopulationAge91(Integer populationAge91) {
		this.populationAge91 = populationAge91;
	}

	public Integer getPopulationAge92() {
		return populationAge92;
	}

	public void setPopulationAge92(Integer populationAge92) {
		this.populationAge92 = populationAge92;
	}

	public Integer getPopulationAge93() {
		return populationAge93;
	}

	public void setPopulationAge93(Integer populationAge93) {
		this.populationAge93 = populationAge93;
	}

	public Integer getPopulationAge94() {
		return populationAge94;
	}

	public void setPopulationAge94(Integer populationAge94) {
		this.populationAge94 = populationAge94;
	}

	public Integer getPopulationAge95() {
		return populationAge95;
	}

	public void setPopulationAge95(Integer populationAge95) {
		this.populationAge95 = populationAge95;
	}

	public Integer getPopulationAge96() {
		return populationAge96;
	}

	public void setPopulationAge96(Integer populationAge96) {
		this.populationAge96 = populationAge96;
	}

	public Integer getPopulationAge97() {
		return populationAge97;
	}

	public void setPopulationAge97(Integer populationAge97) {
		this.populationAge97 = populationAge97;
	}

	public Integer getPopulationAge98() {
		return populationAge98;
	}

	public void setPopulationAge98(Integer populationAge98) {
		this.populationAge98 = populationAge98;
	}

	public Integer getPopulationAge99() {
		return populationAge99;
	}

	public void setPopulationAge99(Integer populationAge99) {
		this.populationAge99 = populationAge99;
	}

	public Integer getPopulationAge100() {
		return populationAge100;
	}

	public void setPopulationAge100(Integer populationAge100) {
		this.populationAge100 = populationAge100;
	}
    

}

