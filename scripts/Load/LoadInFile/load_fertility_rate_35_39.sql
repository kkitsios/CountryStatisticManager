LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_35_39.csv'
INTO TABLE aux_fertility_rate_35_39
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;