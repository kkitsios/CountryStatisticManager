LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_45_49.csv'
INTO TABLE aux_fertility_rate_45_49
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;