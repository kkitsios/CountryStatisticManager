LOAD DATA
INFILE '/var/lib/mysql-files/midyear_population.csv'
INTO TABLE aux_midyear_population
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;