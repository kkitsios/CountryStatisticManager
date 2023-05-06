USE matso_data;
CREATE TABLE 5yr_age_midyear_population_male AS 
SELECT countries.ISO_Code, aux_5yr_age_midyear_population_male.*
FROM aux_5yr_age_midyear_population_male
JOIN countries
ON countries.Display_Name = aux_5yr_age_midyear_population_male.country_name;
alter table 5yr_age_midyear_population_male add constraint primary key (country_code, year); 
alter table 5yr_age_midyear_population_male add constraint foreign key (Iso_code) references countries (Iso_code);