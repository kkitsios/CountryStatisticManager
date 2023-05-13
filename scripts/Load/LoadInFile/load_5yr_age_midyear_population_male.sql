LOAD DATA
INFILE '/var/lib/mysql-files/5yr_age_midyear_population_male.csv'
INTO TABLE aux_5yr_age_midyear_population_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;