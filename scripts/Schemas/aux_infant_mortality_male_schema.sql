CREATE TABLE aux_infant_mortality_male (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  infant_mortality_male FLOAT,
  PRIMARY KEY (country_code, year)
);