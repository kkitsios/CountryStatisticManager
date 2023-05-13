LOAD DATA
INFILE '/var/lib/mysql-files/crude_death_rate.csv'
INTO TABLE aux_crude_death_rate
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;