USE world_data;
CREATE TABLE fertility_rate_30_34 AS 
SELECT countries.ISO_Code, aux_fertility_rate_30_34.*
FROM aux_fertility_rate_30_34
JOIN countries
ON countries.Display_Name = aux_fertility_rate_30_34.country_name;
alter table fertility_rate_30_34 add constraint primary key (country_code, year); 
alter table fertility_rate_30_34 add constraint foreign key (Iso_code) references countries (Iso_code);