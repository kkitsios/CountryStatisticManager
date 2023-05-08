USE matso_data;
CREATE TABLE gross_reproduction_rate AS 
SELECT countries.ISO_Code, aux_gross_reproduction_rate.*
FROM aux_gross_reproduction_rate
JOIN countries
ON countries.Display_Name = aux_gross_reproduction_rate.country_name;
alter table gross_reproduction_rate add constraint primary key (country_code, year); 
alter table gross_reproduction_rate add constraint foreign key (Iso_code) references countries (Iso_code);