LOAD DATA
INFILE '/var/lib/mysql-files/Labour share of GDP.csv'
INTO TABLE aux_tmp_labour_share_of_gdp
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;