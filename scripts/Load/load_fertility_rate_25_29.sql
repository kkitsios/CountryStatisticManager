USE matso_data;
CREATE TABLE fertility_rate_25_29 AS 
SELECT countries.ISO_Code, aux_fertility_rate_25_29.country_name, aux_fertility_rate_25_29.country_code,
		aux_fertility_rate_25_29.year, aux_fertility_rate_25_29.fertility_rate_25_29
FROM aux_fertility_rate_25_29
JOIN countries
ON countries.Display_Name = aux_fertility_rate_25_29.country_name;
alter table fertility_rate_25_29 add constraint primary key (country_code, year); 
alter table fertility_rate_25_29 add constraint foreign key (Iso_code) references countries (Iso_code);