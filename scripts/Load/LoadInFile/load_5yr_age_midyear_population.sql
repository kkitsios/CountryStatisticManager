LOAD DATA
INFILE '/var/lib/mysql-files/5yr_age_midyear_population.csv'
INTO TABLE aux_5yr_age_midyear_population
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;