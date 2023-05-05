CREATE TABLE aux_gross_reproduction_rate (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  gross_reproduction_rate FLOAT,
  PRIMARY KEY (country_code, year)
);
