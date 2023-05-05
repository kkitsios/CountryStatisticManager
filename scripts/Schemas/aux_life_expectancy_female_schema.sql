CREATE TABLE aux_life_expectancy_female (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  life_expectancy_female FLOAT,
  PRIMARY KEY (country_code, year)
);
