USE matso_data;
CREATE TABLE gross_fixed_capital_formation AS 
SELECT countries.ISO_Code, aux_gross_fixed_capital_formation.*
FROM gross_fixed_capital_formation
JOIN countries
ON countries.Display_Name = aux_gross_fixed_capital_formation.country_name;
alter table gross_fixed_capital_formation add constraint primary key (country_id); 
alter table gross_fixed_capital_formation add constraint foreign key (Iso_code) references countries (Iso_code);