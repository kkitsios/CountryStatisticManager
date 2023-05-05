USE matso_data;
CREATE TABLE fertility_rate_35_39 AS 
SELECT countries.ISO_Code, aux_fertility_rate_35_39.country_name, aux_fertility_rate_35_39.country_code,
		aux_fertility_rate_35_39.year, aux_fertility_rate_35_39.fertility_rate_35_39
FROM aux_fertility_rate_35_39
JOIN countries
ON countries.Display_Name = aux_fertility_rate_35_39.country_name;
alter table fertility_rate_35_39 add constraint primary key (country_code, year); 
alter table fertility_rate_35_39 add constraint foreign key (Iso_code) references countries (Iso_code);