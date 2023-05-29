USE world_data;
CREATE TABLE infant_mortality_female AS 
SELECT countries.ISO_Code, aux_infant_mortality_female.*
FROM aux_infant_mortality_female
JOIN countries
ON countries.Display_Name = aux_infant_mortality_female.country_name;
alter table infant_mortality_female add constraint primary key (country_code, year); 
alter table infant_mortality_female add constraint foreign key (Iso_code) references countries (Iso_code);