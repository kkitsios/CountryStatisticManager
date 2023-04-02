import csv
import pandas as pd

def load_csv(filename):
    with open(filename, 'r', encoding="ISO-8859-1") as csvfile:
        reader = csv.reader(csvfile)
        headers = next(reader, None)
        data = {}
        for header in headers:
            data[header] = []
        for row in reader:
            for i in range(len(row)):
                data[headers[i]].append(row[i])
        return data


def load_xlsx_sheet(file_path, sheet_name):
    # Load the sheet into a pandas dataframe
    df = pd.read_excel(file_path, sheet_name=sheet_name)

    # Convert the dataframe to a dictionary where the keys are column names
    # and the values are lists of column values
    column_values = {}
    for column_name in df.columns:
        column_values[column_name] = df[column_name].tolist()

    # Return the column values as a dictionary
    return column_values
