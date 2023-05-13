LOAD DATA
INFILE '/var/lib/mysql-files/Estimated GNI female.csv'
INTO TABLE aux_tmp_estimated_gni_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;