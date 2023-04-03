import pandas
import parser
import matsimatsi

countries_file = "../../countries.csv"
income_by_country = "../../Income by Country.xlsx"


def hashmap_matsi_matsi():



	the_countries_matsi = []

	try:
	    the_countries_matsi = parser.load_csv(countries_file)["Display_Name"]
	    
	except UnicodeDecodeError:
	    pass  # ignore the error and continue with the code

	GDP_Income_by_country_matsi = parser.load_xlsx_sheet(income_by_country, "GDP total")["Country"]


	countries_hashmap = {countries: countries for countries, gdp_countries in zip(the_countries_matsi, GDP_Income_by_country_matsi)}
	print(countries_hashmap)


hashmap_matsi_matsi()	