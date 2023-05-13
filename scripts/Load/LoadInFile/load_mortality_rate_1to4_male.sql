LOAD DATA
INFILE '/var/lib/mysql-files/mortality_rate_1to4_male.csv'
INTO TABLE aux_mortality_rate_1to4_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;