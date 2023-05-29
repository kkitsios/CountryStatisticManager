import parser
import set_difference

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"

def print_set_values(my_set):
    my_list = [
        "Organization for Economic Co-operation and Development",
        "High human development",
        "Medium human development",
        "Developing Countries",
        "Very high human development",
        "Least Developed Countries",
        "Arab States",
        "Human Development",
        "Europe and Central Asia",
        "Low human development",
        "East Asia and the Pacific",
        "Regions",
        "Small Island Developing States",
    ]


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
    print(shit, print_set_values(set_difference.matsi_matsi(set(the_matsi), set(the_other_matsi))))
    print(25*"-*-")