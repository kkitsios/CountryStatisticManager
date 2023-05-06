USE matso_data;
CREATE TABLE gdp_total AS 
SELECT countries.ISO_Code, aux_gdp_total.*
FROM gdp_total
JOIN countries
ON countries.Display_Name = aux_gdp_total.country_name;
alter table gdp_total add constraint primary key (country_id); 
alter table gdp_total add constraint foreign key (Iso_code) references countries (Iso_code);