import happybase as hb

connection = hb.Connection("localhost")

print(connection.tables())