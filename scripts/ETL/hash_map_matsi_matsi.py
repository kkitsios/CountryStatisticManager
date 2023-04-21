import parser
import matsimatsi

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"
out = "./outputs/"
matsi = {
    "Lao People's Democratic Republic": "Laos",
    "Bolivia (Plurinational State of)": "Bolivia",
    "Venezuela (Bolivarian Republic of)": "Venezuela",
    "Korea (Republic of)": "South Korea",
    "Brunei Darussalam": "Brunei",
    "Congo (Democratic Republic of the)": "Democratic Republic of the Congo",
    "Eswatini (Kingdom of)": "Swaziland",
    "Côte d'Ivoire": "Ivory Coast",
    "CÃ´te d'Ivoire": "Ivory Coast",
    "Moldova (Republic of)": "Moldova",
    "Viet Nam": "Vietnam",
    "Micronesia (Federated States of)": "Micronesia",
    "Iran (Islamic Republic of)": "Iran",
    "Tanzania (United Republic of)": "Tanzania",
    "Palestine; State of": "Palestinian Territory",
    "Cabo Verde": "Cape Verde",
    "Congo": "Republic of the Congo",
    "Russian Federation": "Russia",
    "North Macedonia": "Macedonia",
    "Syrian Arab Republic": "Syria",
    "Timor-Leste": "Timor Leste",
    "Hong Kong; China (SAR)": "Hong Kong"
}

ignoring_list = [
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
        "World",
        'South Asia', 'Sub-Saharan Africa', 'Latin America and the Caribbean'
    ]

def matsi_names(cname):
    if cname is not None and cname not in ignoring_list:
            if cname in matsi:
                return matsi[cname]
            else:
                return cname

# years = [year for year in range(1990, 2019)]      
def all_str(lst):
    for elem in lst:
        if elem is not None and not isinstance(elem, str):
            return False
    
    return True
     
shits = dict()

for shit in parser.get_xlsx_sheets(income_by_country):
    countries = dict()
    shits[shit] = countries
    content = parser.load_xlsx_sheet(income_by_country, shit)
    headers = list(content.keys())
    for j, cname in enumerate(content['Country']):
         vals = []
         countries[matsi_names(cname)] = vals
         for i in range(len(headers)):
              year = headers[i]
              if (type(year) == int):
                val = content[year][j]
                vals.append(val)
    

for shit in parser.get_xlsx_sheets(income_by_country):
    lst = []
    countries = shits[shit]
    for key, values in countries.items():
        if all_str(values):
            lst.append(key)
    for key in lst:
        del countries[key]
    print(len(countries['South Sudan']))
    break
    
# test1 = set(list(shits['Income Index'].keys()))
# the_other_matsi = set(parser.load_csv(countries_file)["Display_Name"])

# print(matsimatsi.matsi_matsi(test1, the_other_matsi))

              
                   
    