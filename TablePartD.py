import happybase as hb

connection = hb.Connection("localhost", 9090)

powers = connection.table("powers")

row1 = powers.row("row1")
row19 = powers.row("row19")

print("hero: {0}, power: {1}, name: {2}, xp: {3}, color: {4}".format(
    row1["personal:hero"], row1["personal:power"], row1["professional:name"],
    row1["professional:xp"], row1["custom:color"]
))
print("hero: {0}, color: {1}".format(
    row19["personal:hero"], row19["custom:color"]
))
print("hero: {0}, name: {1}, color: {2}".format(
    row1["personal:hero"], row1["personal:name"], row1["custom:color"]
))

connection.close()
