
USE world_data;
CREATE TABLE life_expectancy_male AS 
SELECT countries.ISO_Code, aux_life_expectancy_male.*
FROM aux_life_expectancy_male
JOIN countries
ON countries.Display_Name = aux_life_expectancy_male.country_name;
alter table life_expectancy_male add constraint primary key (country_code, year); 
alter table life_expectancy_male add constraint foreign key (Iso_code) references countries (Iso_code);