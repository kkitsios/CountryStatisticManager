LOAD DATA
INFILE '/var/lib/mysql-files/mortality_rate_under5_male.csv'
INTO TABLE aux_mortality_rate_under5_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;