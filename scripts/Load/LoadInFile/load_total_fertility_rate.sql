LOAD DATA
INFILE '/var/lib/mysql-files/total_fertility_rate.csv'
INTO TABLE aux_total_fertility_rate
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;