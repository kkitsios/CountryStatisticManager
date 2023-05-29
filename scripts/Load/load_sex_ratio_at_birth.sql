
USE world_data;
CREATE TABLE sex_ratio_at_birth AS 
SELECT countries.ISO_Code, aux_sex_ratio_at_birth.*
FROM aux_sex_ratio_at_birth
JOIN countries
ON countries.Display_Name = aux_sex_ratio_at_birth.country_name;
alter table sex_ratio_at_birth add constraint primary key (country_code, year); 
alter table sex_ratio_at_birth add constraint foreign key (Iso_code) references countries (Iso_code);