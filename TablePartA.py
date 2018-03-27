import happybase as hb

connection = hb.Connection("localhost", 9090)

columns = {b"personal" : dict(), b"professional": dict(), b"custom": dict()}
powers  = connection.create_table("powers", columns)

columns = {b"nutrition": dict(), b"taste": dict()}
food    = connection.create_table("food", columns)

connection.close()
