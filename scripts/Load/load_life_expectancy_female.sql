USE world_data;
CREATE TABLE life_expectancy_female AS 
SELECT countries.ISO_Code, aux_life_expectancy_female.*
FROM aux_life_expectancy_female
JOIN countries
ON countries.Display_Name = aux_life_expectancy_female.country_name;
alter table life_expectancy_female add constraint primary key (country_code, year); 
alter table life_expectancy_female add constraint foreign key (Iso_code) references countries (Iso_code);