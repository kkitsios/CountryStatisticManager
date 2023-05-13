LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_20_24.csv'
INTO TABLE aux_fertility_rate_20_24
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;