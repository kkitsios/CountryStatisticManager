LOAD DATA
INFILE '/var/lib/mysql-files/GDP total.csv'
INTO TABLE aux_tmp_gdp_total
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;