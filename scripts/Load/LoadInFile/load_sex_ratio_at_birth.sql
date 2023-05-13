LOAD DATA
INFILE '/var/lib/mysql-files/sex_ratio_at_birth.csv'
INTO TABLE aux_sex_ratio_at_birth.sql
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;