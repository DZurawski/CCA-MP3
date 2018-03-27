import happybase as hb

connection = hb.Connection("localhost", 9090)

powers = connection.table("powers")

row1 = powers.row("row1")
row19 = powers.row("row19")

print("hero: {0}, power: {1}, name: {2}, xp: {3}, color: {4}".format(*row1[1:]))
print("hero: {0}, color: {1}".format(row19[1], row19[-1])
print("hero: {0}, name: {1}, color: {2}".format(row1[1], row1[3], row1[-1]))

connection.close()
