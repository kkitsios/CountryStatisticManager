USE world_data;
CREATE TABLE countries_area AS 
SELECT countries.ISO_Code, aux_countries_area.country_name, aux_countries_area.country_code,
        aux_countries_area.country_area
FROM aux_countries_area
JOIN countries
ON countries.Display_Name = aux_countries_area.country_name;
alter table countries_area add constraint primary key (country_code); 
alter table countries_area add constraint foreign key (Iso_code) references countries (Iso_code);