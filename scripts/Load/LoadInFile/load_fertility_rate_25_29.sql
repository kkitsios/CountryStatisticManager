LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_25_29.csv'
INTO TABLE aux_fertility_rate_25_29
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;