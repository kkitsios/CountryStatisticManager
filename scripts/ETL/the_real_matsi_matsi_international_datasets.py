import parser
import matsimatsi

countries_file = "../../countries.csv"
international_datasets = ["age_specific_fertility_rates.csv","birth_death_growth_rates.csv","country_names_area.csv","midyear_population.csv","midyear_population_5yr_age_sex.csv","midyear_population_age_sex.csv","mortality_life_expectancy.csv"]
dir_international_datasets = "../../InternationalDatasetsSmall/"

def print_set_values(my_set):
    my_list = []
    # my_list = ["Cabo Verde", "Viet Nam", "Eswatini (Kingdom of)", "Bolivia (Plurinational State of)","Congo",
    # "Latin America and the Caribbean", "Moldova (Republic of)", "Iran (Islamic Republic of)", "Brunei Darussalam",
    # "Syrian Arab Republic", "Russian Federation"]

    for value in my_set:
        if value not in my_list:print(value)


the_other_matsi = []

try:
    the_other_matsi = parser.load_csv(countries_file)["Display_Name"]
    
except UnicodeDecodeError:
    pass  # ignore the error and continue with the code

for csvs in international_datasets:
    print(csvs+"\n\n")
    the_matsi = parser.load_csv(dir_international_datasets+csvs)["country_name"]
    print(print_set_values(matsimatsi.matsi_matsi(set(the_matsi), set(the_other_matsi))))
    print(25*"-*-")
    break