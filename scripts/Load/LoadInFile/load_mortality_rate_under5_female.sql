LOAD DATA
INFILE '/var/lib/mysql-files/mortality_rate_under5_female.csv'
INTO TABLE aux_mortality_rate_under5_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;