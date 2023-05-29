USE world_data;
CREATE TABLE midyear_population_age_sex AS 
SELECT countries.ISO_Code, aux_midyear_population_age_sex.*
FROM aux_midyear_population_age_sex
JOIN countries
ON countries.Display_Name = aux_midyear_population_age_sex.country_name;
alter table midyear_population_age_sex add constraint primary key (country_code, year, sex); 
alter table midyear_population_age_sex add constraint foreign key (Iso_code) references countries (Iso_code);