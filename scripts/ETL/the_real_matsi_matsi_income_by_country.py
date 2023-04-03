import parser
import matsimatsi

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"

def print_set_values(my_set):
    my_list = ["Cabo Verde", "Viet Nam", "Eswatini (Kingdom of)", "Bolivia (Plurinational State of)","Congo",
    "Latin America and the Caribbean", "Moldova (Republic of)", "Iran (Islamic Republic of)", "Brunei Darussalam",
    "Syrian Arab Republic", "Russian Federation"]

    for value in my_set:
        if value not in my_list:print(value)


the_other_matsi = []

try:
    the_other_matsi = parser.load_csv(countries_file)["Display_Name"]
    
except UnicodeDecodeError:
    pass  # ignore the error and continue with the code

for shit in parser.get_xlsx_sheets(income_by_country):
    print(shit+"\n\n")
    the_matsi = parser.load_xlsx_sheet(income_by_country, shit)["Country"]
    print(shit, print_set_values(matsimatsi.matsi_matsi(set(the_matsi), set(the_other_matsi))))
    print(25*"-*-")