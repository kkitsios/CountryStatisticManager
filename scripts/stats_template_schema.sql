CREATE TABLE stats (
    country_code VARCHAR(2) NOT NULL,
    year INTEGER NOT NULL,
    stat REAL,
    PRIMARY KEY (country_code, year),
    FOREIGN KEY (country_code) REFERENCES countries (ISO)
);