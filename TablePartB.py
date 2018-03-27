import happybase as hb

connection = hb.Connection("localhost", 9090)

print(connection.tables())

connection.close()
