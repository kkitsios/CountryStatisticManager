LOAD DATA
INFILE '/var/lib/mysql-files/GNI per capita.csv'
INTO TABLE aux_tmp_gni_per_capita
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;