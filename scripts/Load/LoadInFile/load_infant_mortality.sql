LOAD DATA
INFILE '/var/lib/mysql-files/infant_mortality.csv'
INTO TABLE aux_infant_mortality
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;