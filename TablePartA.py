import happybase as hb

connection = hb.Connection("host")

columns = {"personal" : dict(), "professional": dict(), "custom": dict()}
powers  = connection.create_table("powers", columns)

columns = {"nutrition": dict(), "taste": dict()}
food    = connection.create_table("food", columns)
