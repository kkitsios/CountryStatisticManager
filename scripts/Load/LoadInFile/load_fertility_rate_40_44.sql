LOAD DATA
INFILE '/var/lib/mysql-files/fertility_rate_40_44.csv'
INTO TABLE aux_fertility_rate_40_44
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;