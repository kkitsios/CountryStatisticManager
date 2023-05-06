USE matso_data;
CREATE TABLE estimated_gni_female AS 
SELECT countries.ISO_Code, aux_estimated_gni_female.*
FROM estimated_gni_female
JOIN countries
ON countries.Display_Name = aux_estimated_gni_female.country_name;
alter table estimated_gni_female add constraint primary key (country_id); 
alter table estimated_gni_female add constraint foreign key (Iso_code) references countries (Iso_code);