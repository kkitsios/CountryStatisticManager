LOAD DATA
INFILE '/var/lib/mysql-files/Gross fixed capital formation.csv'
INTO TABLE aux_tmp_gross_fixed_capital_formation
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;