CREATE TABLE stats (
  country_code VARCHAR(2) NOT NULL,
  year INT NOT NULL,
  stat FLOAT,
  PRIMARY KEY (country_code, year),
  FOREIGN KEY (country_code) REFERENCES countries (ISO)
);
