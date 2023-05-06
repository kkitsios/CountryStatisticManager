
USE matso_data;
CREATE TABLE total_fertility_rate AS 
SELECT countries.ISO_Code, aux_total_fertility_rate.country_name, aux_total_fertility_rate.country_code,
		aux_total_fertility_rate.year, aux_total_fertility_rate.total_fertility_rate
FROM aux_total_fertility_rate
JOIN countries
ON countries.Display_Name = aux_total_fertility_rate.country_name;
alter table total_fertility_rate add constraint primary key (country_code, year); 
alter table total_fertility_rate add constraint foreign key (Iso_code) references countries (Iso_code);