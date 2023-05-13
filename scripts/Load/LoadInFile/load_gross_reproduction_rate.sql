LOAD DATA
INFILE '/var/lib/mysql-files/gross_reproduction_rate.csv'
INTO TABLE aux_gross_reproduction_rate
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;