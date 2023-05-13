LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_30_34.csv'
INTO TABLE aux_fertility_rate_30_34
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;