LOAD DATA
INFILE '/var/lib/mysql-files/midyear_population_age_sex.csv'
INTO TABLE aux_midyear_population_age_sex
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;