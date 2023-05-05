CREATE TABLE aux_life_expectancy (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  life_expectancy FLOAT,
  PRIMARY KEY (country_code, year)
);
s