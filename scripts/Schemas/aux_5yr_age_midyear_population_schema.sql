CREATE TABLE aux_5yr_age_midyear_population (
  country_id INTEGER NOT NULL AUTO_INCREMENT,
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  total_flag VARCHAR(1),
  starting_age INT,
  age_group_indicator VARCHAR(1),
  ending_age INT,
  5yr_age_midyear_population FLOAT,
  5yr_age_midyear_population_male FLOAT,
  5yr_age_midyear_population_female FLOAT,
  PRIMARY KEY (country_id)
);
