CREATE TABLE aux_fertility_rate_20_24 (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  fertility_rate_20_24 FLOAT,
  PRIMARY KEY (country_code, year)
);
