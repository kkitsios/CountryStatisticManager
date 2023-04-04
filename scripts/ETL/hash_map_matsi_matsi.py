import pandas
import parser
import matsimatsi

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"

matsi = {
    "Lao People's Democratic Republic": "Laos",
    "Bolivia (Plurinational State of)": "Bolivia",
    "Venezuela (Bolivarian Republic of)": "Venezuela",
    "Korea (Republic of)": "South Korea",
    "Brunei Darussalam": "Brunei",
    "Congo (Democratic Republic of the)": "Democratic Republic of the Congo",
    "Eswatini (Kingdom of)": "Swaziland",
    "Côte d'Ivoire": "Ivory Coast",
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


def hashmap_matsi_matsi():



	the_countries_matsi = []

	try:
	    the_countries_matsi = parser.load_csv(countries_file)["Display_Name"]
	    
	except UnicodeDecodeError:
	    pass  # ignore the error and continue with the code

	GDP_Income_by_country_matsi = parser.load_xlsx_sheet(income_by_country, "GDP total")["Country"]

hashmap_matsi_matsi()	