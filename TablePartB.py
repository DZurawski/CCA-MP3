import happybase as hb

connection = hb.Connection("host")

print(connection.tables())