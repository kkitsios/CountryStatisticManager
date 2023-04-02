import csv

def load_csv(filename):
    with open(filename, 'r') as csvfile:
        reader = csv.reader(csvfile)
        headers = next(reader, None)
        data = {}
        for header in headers:
            data[header] = []
        for row in reader:
            for i in range(len(row)):
                data[headers[i]].append(row[i])
        return data
