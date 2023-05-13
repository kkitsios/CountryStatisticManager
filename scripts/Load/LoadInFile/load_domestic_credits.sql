LOAD DATA
INFILE '/var/lib/mysql-files/Domestic credits.csv'
INTO TABLE aux_tmp_domestic_credits
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;