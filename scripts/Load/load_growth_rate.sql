USE world_data;
CREATE TABLE growth_rate AS 
SELECT countries.ISO_Code, aux_growth_rate.*
FROM aux_growth_rate
JOIN countries
ON countries.Display_Name = aux_growth_rate.country_name;
alter table growth_rate add constraint primary key (country_code, year); 
alter table growth_rate add constraint foreign key (Iso_code) references countries (Iso_code);