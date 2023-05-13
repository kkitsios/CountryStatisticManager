LOAD DATA
INFILE '/var/lib/mysql-files/life_expectancy.csv'
INTO TABLE aux_life_expectancy
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;