LOAD DATA
INFILE '/var/lib/mysql-files/infant_mortality_female.csv'
INTO TABLE aux_infant_mortality_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;