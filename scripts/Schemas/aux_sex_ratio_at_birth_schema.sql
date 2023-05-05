CREATE TABLE aux_sex_ratio_at_birth (
  country_code VARCHAR(3) NOT NULL,
  country_name VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  sex_ratio_at_birth FLOAT,
  PRIMARY KEY (country_code, year)
);
