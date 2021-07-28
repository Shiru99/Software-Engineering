import os


print()
print("--------------- CASE 1 ---------------")
file = "TestFiles/Empty.txt"
os.system("java -jar jars/avglength.jar " + file )

print()
print("--------------- CASE 2 ---------------")
file = "TestFiles/Image.jpg"
os.system("java -jar jars/avglength.jar " + file )


print()
print("--------------- CASE 3 ---------------")
file = "TestFiles/Chinese.txt"
os.system("java -jar jars/avglength.jar " + file )


print()
print("--------------- CASE 4 ---------------")
file = "TestFiles/Multiple.txt"
os.system("java -jar jars/avglength.jar " + file )

print()
print("--------------- CASE 5 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file)

print()
print("--------------- CASE 6 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --d ")

print()
print("--------------- CASE 7 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --d " + " a ")


print()
print("--------------- CASE 8 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --d " + " ab ")

print()
print("--------------- CASE 9 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l ")


print()
print("--------------- CASE 10 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l " + " 3 ")


print()
print("--------------- CASE 11 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l " + " -4 ")


print()
print("--------------- CASE 12 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l " + " 3.33 ")


print()
print("--------------- CASE 13 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --d " + " --l ")


print()
print("--------------- CASE 14 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l " + " --d ")


print()
print("--------------- CASE 15 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --d " + " a " + " --l "+ " 3 ")

print()
print("--------------- CASE 16 ---------------")
file = "TestFiles/English.txt"
os.system("java -jar jars/avglength.jar " + file + " --l " + " 3 " + " --d "+ " a ")




print()
print("--------------- --- ---------------")

