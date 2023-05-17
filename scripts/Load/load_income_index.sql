USE matso_data;
CREATE TABLE income_index AS 
SELECT countries.ISO_Code, aux_income_index.*
FROM aux_income_index
JOIN countries
ON countries.Display_Name = aux_income_index.country_name;
alter table income_index add constraint primary key (country_id); 
alter table income_index add constraint foreign key (Iso_code) references countries (Iso_code);