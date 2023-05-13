LOAD DATA
INFILE '/var/lib/mysql-files/net_migration.csv'
INTO TABLE aux_net_migration
FIELDS TERMINATED BY '\t'
IGNORE 1 LINES;