import happybase as hb

connection = hb.Connection()

columns = {"personal" : dict(), "professional": dict(), "custom": dict()}
powers  = connection.create_table("powers", columns)

columns = {"nutrition": dict(), "taste": dict()}
food    = connection.create_table("food", columns)

connection.close()
