LOAD DATA
INFILE '/var/lib/mysql-files/countries.csv'
INTO TABLE countries
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;