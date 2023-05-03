CREATE TABLE fertility_rate_15_19 (
  country_code VARCHAR(2) NOT NULL,
  country_name VARCHAR(25) NOT NULL,
  year INT NOT NULL,
  fertility_rate_15_19 FLOAT,
  PRIMARY KEY (country_code, year),
  FOREIGN KEY (country_name) REFERENCES countries (Display_name)
);
