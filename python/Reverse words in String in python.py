# Reverse words in String in python


str = input("Enter word")

ls = []

temp = str.split(" ")

for i in temp:
    ls.append(i)

ls.reverse()
s=""
for i in ls:
    s+=i+" "

print(s) 