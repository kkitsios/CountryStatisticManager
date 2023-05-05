USE matso_data;
CREATE TABLE fertility_rate_20_24 AS 
SELECT countries.ISO_Code, aux_fertility_rate_20_24.country_name, aux_fertility_rate_20_24.country_code,
		aux_fertility_rate_20_24.year, aux_fertility_rate_20_24.fertility_rate_20_24
FROM aux_fertility_rate_20_24
JOIN countries
ON countries.Display_Name = aux_fertility_rate_20_24.country_name;
alter table fertility_rate_20_24 add constraint primary key (country_code, year); 
alter table fertility_rate_20_24 add constraint foreign key (Iso_code) references countries (Iso_code);