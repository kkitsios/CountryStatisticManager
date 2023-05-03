import parser
import csv
dataset = "../../InternationalDatasetsSmall/birth_death_growth_rates.csv"
out_dir = "./outputs/internationalDataset/"

dataset_hashmap = parser.load_csv(dataset)
fixed_columns = ["country_code", "country_name", "year"]
stat_columns = list(set(dataset_hashmap.keys()) - set(fixed_columns))

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
