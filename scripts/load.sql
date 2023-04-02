LOAD DATA LOCAL INFILE '/home/tasakos/MyWork/Databases III/matso-data/countries.csv'
INTO TABLE countries
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
