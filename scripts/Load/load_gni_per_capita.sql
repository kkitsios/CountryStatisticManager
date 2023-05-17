USE matso_data;
CREATE TABLE gni_per_capita AS 
SELECT countries.ISO_Code, aux_gni_per_capita.*
FROM aux_gni_per_capita
JOIN countries
ON countries.Display_Name = aux_gni_per_capita.country_name;
alter table gni_per_capita add constraint primary key (country_id); 
alter table gni_per_capita add constraint foreign key (Iso_code) references countries (Iso_code);