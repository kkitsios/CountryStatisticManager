CREATE TABLE aux_crude_birth_rate (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  crude_birth_rate FLOAT,
  PRIMARY KEY (country_code, year)
);
