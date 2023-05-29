USE world_data;
CREATE TABLE fertility_rate_40_44 AS 
SELECT countries.ISO_Code, aux_fertility_rate_40_44.*
FROM aux_fertility_rate_40_44
JOIN countries
ON countries.Display_Name = aux_fertility_rate_40_44.country_name;
alter table fertility_rate_40_44 add constraint primary key (country_code, year); 
alter table fertility_rate_40_44 add constraint foreign key (Iso_code) references countries (Iso_code);