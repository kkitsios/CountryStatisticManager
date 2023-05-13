LOAD DATA
INFILE '/var/lib/mysql-files/crude_birth_rate.csv'
INTO TABLE aux_crude_birth_rate
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;

