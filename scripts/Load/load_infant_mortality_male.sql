USE matso_data;
CREATE TABLE infant_mortality_male AS 
SELECT countries.ISO_Code, aux_infant_mortality_male.*
FROM aux_infant_mortality_male
JOIN countries
ON countries.Display_Name = aux_infant_mortality_male.country_name;
alter table infant_mortality_male add constraint primary key (country_code, year); 
alter table infant_mortality_male add constraint foreign key (Iso_code) references countries (Iso_code);