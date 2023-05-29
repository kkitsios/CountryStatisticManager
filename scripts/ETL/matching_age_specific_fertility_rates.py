import parser
import csv
dataset = "../../InternationalDatasetsSmall/age_specific_fertility_rates.csv"
out_dir = "./outputs/internationalDataset/"

dataset_hashmap = parser.load_csv(dataset)
fixed_columns = ["country_code", "country_name", "year"]
stat_columns = list(set(dataset_hashmap.keys()) - set(fixed_columns))

ignore_items =  [None]

matsi_matsi = {
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
    if country in matsi_matsi: dataset_hashmap['country_name'][idx] = matsi_matsi[country]

csvs_hashmap = dict()

for csv_file in stat_columns:
    filename = csv_file+".csv"
    csv_dict = dict()
    for fixed_column in fixed_columns:
        csv_dict[fixed_column] = dataset_hashmap[fixed_column]
    csv_dict[csv_file] = dataset_hashmap[csv_file]
    csvs_hashmap[filename] = csv_dict

for filename in csvs_hashmap:
    my_dict = csvs_hashmap[filename]    
    with open(out_dir+filename, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile, delimiter='\t')
        writer.writerow(my_dict.keys())
        writer.writerows(zip(*my_dict.values()))
