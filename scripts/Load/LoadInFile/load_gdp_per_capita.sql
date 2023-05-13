LOAD DATA
INFILE '/var/lib/mysql-files/GDP per capita.csv'
INTO TABLE aux_tmp_gdp_per_capita
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;