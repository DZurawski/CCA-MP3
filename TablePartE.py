import happybase as hb

connection = hb.Connection()

powers = connection.table("powers")

for key, data in powers.scan(include_timestamp=True):
    if key in (b"row1", b"row10", b"row11"):
        print("Found: {0}, {1}".format(key, data))

connection.close()
