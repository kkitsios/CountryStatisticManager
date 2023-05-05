CREATE TABLE aux_total_fertility_rate (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  total_fertility_rate FLOAT,
  PRIMARY KEY (country_code, year)
);
