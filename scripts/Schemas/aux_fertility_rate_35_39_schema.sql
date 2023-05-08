CREATE TABLE aux_fertility_rate_35_39 (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  value FLOAT,
  PRIMARY KEY (country_code, year)
);
