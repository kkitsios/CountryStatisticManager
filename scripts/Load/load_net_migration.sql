
USE matso_data;
CREATE TABLE net_migration AS 
SELECT countries.ISO_Code, aux_net_migration.country_name, aux_net_migration.country_code,
		aux_net_migration.year, aux_net_migration.net_migration
FROM aux_net_migration
JOIN countries
ON countries.Display_Name = aux_net_migration.country_name;
alter table net_migration add constraint primary key (country_code, year); 
alter table net_migration add constraint foreign key (Iso_code) references countries (Iso_code);