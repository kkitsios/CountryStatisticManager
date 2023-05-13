LOAD DATA
INFILE '/var/lib/mysql-files/growth_rate.csv'
INTO TABLE aux_growth_rate
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;