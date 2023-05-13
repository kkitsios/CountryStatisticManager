LOAD DATA
INFILE '/var/lib/mysql-files/mortality_rate_1to4_female.csv'
INTO TABLE aux_mortality_rate_1to4_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;