CREATE TABLE aux_net_migration (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  net_migration FLOAT,
  PRIMARY KEY (country_code, year)
);
