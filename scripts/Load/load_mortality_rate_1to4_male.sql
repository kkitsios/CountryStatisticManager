
USE world_data;
CREATE TABLE mortality_rate_1to4_male AS 
SELECT countries.ISO_Code, aux_mortality_rate_1to4_male.*
FROM aux_mortality_rate_1to4_male
JOIN countries
ON countries.Display_Name = aux_mortality_rate_1to4_male.country_name;
alter table mortality_rate_1to4_male add constraint primary key (country_code, year); 
alter table mortality_rate_1to4_male add constraint foreign key (Iso_code) references countries (Iso_code);