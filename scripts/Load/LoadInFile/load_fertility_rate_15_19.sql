LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_15_19.csv'
INTO TABLE aux_fertility_rate_15_19
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;