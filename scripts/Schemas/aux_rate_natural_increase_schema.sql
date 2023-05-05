CREATE TABLE aux_rate_natural_increase (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  rate_natural_increase FLOAT,
  PRIMARY KEY (country_code, year)
);
