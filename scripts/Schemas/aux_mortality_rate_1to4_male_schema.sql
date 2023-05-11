CREATE TABLE aux_mortality_rate_1to4_male (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  mortality_rate_1to4_male FLOAT,
  PRIMARY KEY (country_code, year)
);
