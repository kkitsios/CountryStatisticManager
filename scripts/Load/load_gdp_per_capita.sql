USE world_data;
CREATE TABLE gdp_per_capita AS 
SELECT countries.ISO_Code, aux_gdp_per_capita.*
FROM aux_gdp_per_capita
JOIN countries
ON countries.Display_Name = aux_gdp_per_capita.country_name;
alter table gdp_per_capita add constraint primary key (country_id); 
alter table gdp_per_capita add constraint foreign key (Iso_code) references countries (Iso_code);