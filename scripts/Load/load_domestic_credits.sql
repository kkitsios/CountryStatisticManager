USE world_data;
CREATE TABLE domestic_credits AS 
SELECT countries.ISO_Code, aux_domestic_credits.*
FROM aux_domestic_credits
JOIN countries
ON countries.Display_Name = aux_domestic_credits.country_name;
alter table domestic_credits add constraint primary key (country_id); 
alter table domestic_credits add constraint foreign key (Iso_code) references countries (Iso_code);