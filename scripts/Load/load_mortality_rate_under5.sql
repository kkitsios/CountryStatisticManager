
USE world_data;
CREATE TABLE mortality_rate_under5 AS 
SELECT countries.ISO_Code, aux_mortality_rate_under5.*
FROM aux_mortality_rate_under5
JOIN countries
ON countries.Display_Name = aux_mortality_rate_under5.country_name;
alter table mortality_rate_under5 add constraint primary key (country_code, year); 
alter table mortality_rate_under5 add constraint foreign key (Iso_code) references countries (Iso_code);