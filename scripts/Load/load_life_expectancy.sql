USE world_data;
CREATE TABLE life_expectancy AS 
SELECT countries.ISO_Code, aux_life_expectancy.*
FROM aux_life_expectancy
JOIN countries
ON countries.Display_Name = aux_life_expectancy.country_name;
alter table life_expectancy add constraint primary key (country_code, year); 
alter table life_expectancy add constraint foreign key (Iso_code) references countries (Iso_code);