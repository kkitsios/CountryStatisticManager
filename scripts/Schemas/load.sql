LOAD DATA LOCAL INFILE '../ETL/outputs/internationalDataset/fertility_rate_15_19.csv'
INTO TABLE fertility_rate_15_19
FIELDS TERMINATED BY '\t'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
