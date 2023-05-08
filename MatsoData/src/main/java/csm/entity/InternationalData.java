package csm.entity;

import javax.persistence.Column;
import javax.persistence.Table;



@Table(name = "fertility_rate_20_24")
public class InternationalData {
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "year")
	private int year;
	@Column(name = "value")
	private float value;
	
}
