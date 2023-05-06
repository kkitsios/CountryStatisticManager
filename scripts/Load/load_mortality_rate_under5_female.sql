
USE matso_data;
CREATE TABLE mortality_rate_under5_female AS 
SELECT countries.ISO_Code, aux_mortality_rate_under5_female.country_name, aux_mortality_rate_under5_female.country_code,
		aux_mortality_rate_under5_female.year, aux_mortality_rate_under5_female.mortality_rate_under5_female
FROM aux_mortality_rate_under5_female
JOIN countries
ON countries.Display_Name = aux_mortality_rate_under5_female.country_name;
alter table mortality_rate_under5_female add constraint primary key (country_code, year); 
alter table mortality_rate_under5_female add constraint foreign key (Iso_code) references countries (Iso_code);