USE world_data;
CREATE TABLE 5yr_age_midyear_population_male_female AS 
SELECT countries.ISO_Code, aux_5yr_age_midyear_population.*
FROM aux_5yr_age_midyear_population
JOIN countries
ON countries.Display_Name = aux_5yr_age_midyear_population.country_name;
alter table 5yr_age_midyear_population_male_female add constraint primary key (country_id); 
alter table 5yr_age_midyear_population_male_female add constraint foreign key (Iso_code) references countries (Iso_code);