import parser

fertility = 'outputs/internationalDataset/fertility_rate_15_19.csv'
countries = '../../countries.csv'

fer_names = parser.load_csv(fertility, delimeter='\t')['country_name']
c_names = parser.load_csv(countries)["Display_Name"]



non_equal_items = []
for i, f_item in enumerate(c_names):
    if f_item != fer_names[i]: non_equal_items.append(fer_names[i])
    
        

print(non_equal_items)
c = 0
for item in fer_names:

    if "Cote d'Ivoire" == item : c+=1

print(c)