USE world_data;
CREATE TABLE infant_mortality AS 
SELECT countries.ISO_Code, aux_infant_mortality.*
FROM aux_infant_mortality
JOIN countries
ON countries.Display_Name = aux_infant_mortality.country_name;
alter table infant_mortality add constraint primary key (country_code, year); 
alter table infant_mortality add constraint foreign key (Iso_code) references countries (Iso_code);