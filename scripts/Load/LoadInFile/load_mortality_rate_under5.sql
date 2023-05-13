LOAD DATA
INFILE '/var/lib/mysql-files/mortality_rate_under5.csv'
INTO TABLE aux_mortality_rate_under5
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;