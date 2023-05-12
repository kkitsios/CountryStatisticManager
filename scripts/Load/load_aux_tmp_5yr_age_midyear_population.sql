LOAD DATA
INFILE '/var/lib/mysql-files/midyear_population_5yr_age_sex.csv'
INTO TABLE aux_tmp_5yr_age_midyear_population
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;

