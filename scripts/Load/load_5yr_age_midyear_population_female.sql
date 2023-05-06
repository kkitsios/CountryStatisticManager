USE matso_data;
CREATE TABLE 5yr_age_midyear_population_female AS 
SELECT countries.ISO_Code, aux_5yr_age_midyear_population_female.*
FROM aux_5yr_age_midyear_population_female
JOIN countries
ON countries.Display_Name = aux_5yr_age_midyear_population_female.country_name;
alter table 5yr_age_midyear_population_female add constraint primary key (country_code, year); 
alter table 5yr_age_midyear_population_female add constraint foreign key (Iso_code) references countries (Iso_code);