import parser
import csv
dataset = "../../InternationalDatasetsSmall/midyear_population_age_sex.csv"
out_dir = "./outputs/internationalDataset/"



dataset_hashmap = parser.load_csv(dataset)

ignore_items =  [None]

match_right_countries_name = {
    'Korea North': "North Korea",
    'Korea South': "South Korea",
    "CÃ´te d'Ivoire": "Ivory Coast",
    "Cote d'Ivoire": "Ivory Coast",
    "Timor-Leste": "Timor Leste",
    'Congo (Brazzaville)': "Democratic Republic of the Congo",
    'Congo (Kinshasa)': "Democratic Republic of the Congo",
    'West Bank': 'Palestinian Territory',
    'Macau': 'Macao',
    'Gaza Strip': 'Palestinian Territory',
    'Burma': 'Myanmar',
    'Micronesia Federated States of': 'Micronesia',
    'Gambia The': "Gambia",
    'Virgin Islands U.S.': 'U.S. Virgin Islands',
    'Bahamas The': "Bahamas",
    'Virgin Islands British': "British Virgin Islands",
    "Cabo Verde": "Cape Verde",
}

# find indexes
idxs = []
for idx, country in enumerate(dataset_hashmap['country_name']):
    if country in ignore_items: idxs.append(idx)

#clear dataset
for column in dataset_hashmap:
    vals = dataset_hashmap[column]
    vals = [vals[i] for i in range(len(vals)) if i not in idxs]
    dataset_hashmap[column] = vals

# matsi ds
for idx, country in enumerate(dataset_hashmap['country_name']):
    if country in match_right_countries_name: dataset_hashmap['country_name'][idx] = match_right_countries_name[country]

with open(out_dir+"midyear_population_age_sex.csv", 'w', newline='') as csvfile:
        writer = csv.writer(csvfile, delimiter='\t')
        writer.writerow(dataset_hashmap.keys())
        writer.writerows(zip(*dataset_hashmap.values()))
