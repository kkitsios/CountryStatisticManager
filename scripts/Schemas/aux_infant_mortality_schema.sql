CREATE TABLE aux_infant_mortality (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  infant_mortality FLOAT,
  PRIMARY KEY (country_code, year)
);
