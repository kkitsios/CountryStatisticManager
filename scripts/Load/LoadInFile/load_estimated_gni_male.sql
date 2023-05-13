LOAD DATA
INFILE '/var/lib/mysql-files/Estimated GNI male.csv'
INTO TABLE aux_tmp_estimated_gni_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;