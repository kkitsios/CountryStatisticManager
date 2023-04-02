CREATE TABLE countries (
  ISO_Code INT PRIMARY KEY,
  ISO VARCHAR(3),
  ISO3 VARCHAR(3),
  FIPS VARCHAR(2),
  Display_Name VARCHAR(100),
  Official_Name VARCHAR(200),
  Capital VARCHAR(100),
  Continent VARCHAR(50),
  CurrencyCode VARCHAR(3),
  CurrencyName VARCHAR(100),
  Phone VARCHAR(20),
  Region_Code VARCHAR(5),
  Region_Name VARCHAR(100),
  Subregion_Code VARCHAR(5),
  Subregion_Name VARCHAR(100),
  Intermediate_Region_Code VARCHAR(5),
  Intermediate_Region_Name VARCHAR(100),
  Status VARCHAR(50),
  Developed_or_Developing VARCHAR(50),
  Small_Island_Developing_States VARCHAR(5),
  Land_Locked_Developing_Countries VARCHAR(5),
  Least_Developed_Countries VARCHAR(5),
  Area_SqKm FLOAT,
  Population INT
);
