USE matso_data;
CREATE TABLE estimated_gni_male AS 
SELECT countries.ISO_Code, aux_estimated_gni_male.*
FROM aux_estimated_gni_male
JOIN countries
ON countries.Display_Name = aux_estimated_gni_male.country_name;
alter table estimated_gni_male add constraint primary key (country_id); 
alter table estimated_gni_male add constraint foreign key (Iso_code) references countries (Iso_code);