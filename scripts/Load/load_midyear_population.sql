
USE world_data;
CREATE TABLE midyear_population AS 
SELECT countries.ISO_Code, aux_midyear_population.*
FROM aux_midyear_population
JOIN countries
ON countries.Display_Name = aux_midyear_population.country_name;
alter table midyear_population add constraint primary key (country_code, year); 
alter table midyear_population add constraint foreign key (Iso_code) references countries (Iso_code);