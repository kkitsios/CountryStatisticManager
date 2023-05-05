CREATE TABLE aux_midyear_population (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  midyear_population FLOAT,
  PRIMARY KEY (country_code, year)
);
