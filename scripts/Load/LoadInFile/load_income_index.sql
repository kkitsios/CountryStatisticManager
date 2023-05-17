LOAD DATA
INFILE '/var/lib/mysql-files/Income Index.csv'
INTO TABLE aux_tmp_income_index
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;