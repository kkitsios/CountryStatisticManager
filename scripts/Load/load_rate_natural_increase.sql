
USE matso_data;
CREATE TABLE rate_natural_increase AS 
SELECT countries.ISO_Code, aux_rate_natural_increase.*
FROM aux_rate_natural_increase
JOIN countries
ON countries.Display_Name = aux_rate_natural_increase.country_name;
alter table rate_natural_increase add constraint primary key (country_code, year); 
alter table rate_natural_increase add constraint foreign key (Iso_code) references countries (Iso_code);