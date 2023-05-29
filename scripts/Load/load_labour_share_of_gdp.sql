USE world_data;
CREATE TABLE labour_share_of_gdp AS 
SELECT countries.ISO_Code, aux_labour_share_of_gdp.*
FROM aux_labour_share_of_gdp
JOIN countries
ON countries.Display_Name = aux_labour_share_of_gdp.country_name;
alter table labour_share_of_gdp add constraint primary key (country_id); 
alter table labour_share_of_gdp add constraint foreign key (Iso_code) references countries (Iso_code);