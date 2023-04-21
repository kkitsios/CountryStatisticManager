import parser
import matsimatsi
import interpolation

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"
out_dir = "./outputs/income_by_country/"
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
    

# clear all '..' records
for shit in parser.get_xlsx_sheets(income_by_country):
    del shits[shit][None]
    lst = []
    countries = shits[shit]
    for key, values in countries.items():
        if all_str(values):
            lst.append(key)
    for key in lst:
        del countries[key]


#interpolation time!
for shit in parser.get_xlsx_sheets(income_by_country):    
    countries = shits[shit]
    for key, values in countries.items():
        countries[key] = interpolation.interpolate_missing(values)
        
#expand 5ades
# TODO

#final momment

for shit in parser.get_xlsx_sheets(income_by_country):
    content = parser.load_xlsx_sheet(income_by_country, shit)
    headers = list(content.keys())
    countries = shits[shit]
    out_string = "\t".join([str(x) for x in headers]) + "\n"
    for key, value in countries.items():
        out_string = out_string + key + "\t"
        for i, val in enumerate(value):
            tb = "\t"
            if i == len(value)-1: tb = "\n"
            out_string = out_string + str(val) + tb
    with open (out_dir+shit+".csv", "w") as f:
        f.write(out_string)
        f.close()
