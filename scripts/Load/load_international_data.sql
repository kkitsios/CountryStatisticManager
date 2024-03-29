CREATE TABLE international_data AS
SELECT *
FROM fertility_rate_15_19
NATURAL JOIN fertility_rate_20_24
NATURAL JOIN fertility_rate_25_29
NATURAL JOIN fertility_rate_30_34
NATURAL JOIN fertility_rate_35_39
NATURAL JOIN fertility_rate_40_44
NATURAL JOIN fertility_rate_44_49
NATURAL JOIN crude_birth_rate
NATURAL JOIN crude_death_rate
NATURAL JOIN gross_reproduction_rate
NATURAL JOIN growth_rate
NATURAL JOIN infant_mortality
NATURAL JOIN infant_mortality_male
NATURAL JOIN infant_mortality_female
NATURAL JOIN life_expectancy
NATURAL JOIN life_expectancy_male
NATURAL JOIN life_expectancy_female
NATURAL JOIN midyear_population
NATURAL JOIN mortality_rate_1to4
NATURAL JOIN mortality_rate_1to4_male
NATURAL JOIN mortality_rate_1to4_female
NATURAL JOIN mortality_rate_under5
NATURAL JOIN mortality_rate_under5_male
NATURAL JOIN mortality_rate_under5_female
NATURAL JOIN net_migration
NATURAL JOIN sex_ratio_at_birth
NATURAL JOIN total_fertility_rate
NATURAL JOIN rate_natural_increase;
alter table international_data add constraint primary key (country_code, year); 
alter table international_data add constraint foreign key (Iso_code) references countries (Iso_code);