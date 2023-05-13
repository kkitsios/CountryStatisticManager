LOAD DATA
INFILE '/var/lib/mysql-files/infant_mortality_male.csv'
INTO TABLE aux_infant_mortality_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;