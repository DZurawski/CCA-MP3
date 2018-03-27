import happybase as hb
import csv

connection = hb.Connection("localhost", 9090)

powers = connection.table(b"powers")

with open("input.csv") as file:
    for row in csv.reader(file):
        row = [bytes(value) for value in row]
        data = {
            b"personal:hero"     : row[1], b"personal:power"  : row[2],
            b"professional:name" : row[3], b"professional:xp" : row[4],
            b"custom:color"      : row[5]
        }
        powers.put(row[0], data)
        break
        
connection.close()
