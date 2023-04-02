CREATE TABLE countries_area (
  country_code VARCHAR(3) PRIMARY KEY,
  country_name VARCHAR(50),
  country_area INT,
  FOREIGN KEY (country_code) REFERENCES countries (ISO)
);
