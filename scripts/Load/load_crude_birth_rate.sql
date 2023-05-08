USE matso_data;
CREATE TABLE crude_birth_rate AS 
SELECT countries.ISO_Code, aux_crude_birth_rate.*
FROM aux_crude_birth_rate
JOIN countries
ON countries.Display_Name = aux_crude_birth_rate.country_name;
alter table crude_birth_rate add constraint primary key (country_code, year); 
alter table crude_birth_rate add constraint foreign key (Iso_code) references countries (Iso_code);