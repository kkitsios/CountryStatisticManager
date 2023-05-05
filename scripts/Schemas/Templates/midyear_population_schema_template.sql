CREATE TABLE midyear_population_template (
  country_code VARCHAR(2) NOT NULL,
  country_name VARCHAR(100),
  year INT NOT NULL,
  total_flag CHAR(1),
  starting_age INT,
  age_group_indicator BOOLEAN,
  ending_age INT,
  midyear_population INT,
  PRIMARY KEY (country_code, year),
  FOREIGN KEY (country_code) REFERENCES countries (ISO),
  INDEX (country_name)
);
