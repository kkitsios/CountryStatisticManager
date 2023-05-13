LOAD DATA
INFILE '/var/lib/mysql-files/life_expectancy_female.csv'
INTO TABLE aux_life_expectancy_female
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;