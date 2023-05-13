LOAD DATA
INFILE '/var/lib/mysql-files/life_expectancy_male.csv'
INTO TABLE aux_life_expectancy_male
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;