import parser
import matsimatsi

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"

def print_set_values(my_set):
    my_list = ['Europe and Central Asia', 'Very high human development', 'Palestine; State of', 'Korea (Republic of)', 'Hong Kong; China (SAR)', 'East Asia and the Pacific', 'Timor-Leste', "Lao People's Democratic Republic", 'Medium human development', 'Small Island Developing States', 'Developing Countries', 'Arab States', 'Congo (Democratic Republic of the)', 'Sub-Saharan Africa',
     "Least Developed Countries", "Organization for Economic Co-operation and Development", "None"]

    for value in my_set:
        if value not in my_list:print(value)


the_other_matsi = []

try:
    the_other_matsi = parser.load_csv(countries_file)["Display_Name"]
    
except UnicodeDecodeError:
    pass  # ignore the error and continue with the code


the_matsi = parser.load_xlsx_sheet(income_by_country, "GDP total")["Country"]
print(len(the_other_matsi))
print(print_set_values(matsimatsi.matsi_matsi(set(the_matsi), set(the_other_matsi))))