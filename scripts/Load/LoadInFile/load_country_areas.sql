LOAD DATA
INFILE '/var/lib/mysql-files/country_names_area.csv'
INTO TABLE aux_countries_area
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;

