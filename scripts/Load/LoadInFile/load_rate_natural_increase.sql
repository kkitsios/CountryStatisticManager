LOAD DATA
INFILE '/var/lib/mysql-files/rate_natural_increase.csv'
INTO TABLE aux_rate_natural_increase
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;