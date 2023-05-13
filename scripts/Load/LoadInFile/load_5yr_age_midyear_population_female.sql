LOAD DATA
INFILE '/var/lib/mysql-files/5yr_age_midyear_population_female.csv'
INTO TABLE aux_5yr_age_midyear_population_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;