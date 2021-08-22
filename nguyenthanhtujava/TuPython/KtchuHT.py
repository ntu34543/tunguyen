n= "e6yrhtaujthatryt4RỶTRTRT5454"
count = 0
count1 = 0
count2 = 0
count3 = 0
upper = " "
lower = " "
int = " "
for i in n:
    if i.isupper():
        upper += i
        count += 1
    if i.islower():
        lower += i
        count1 += 1
    if i.isdigit():
        int += i
        count2 += 1
print (upper,"có:",count)
print(lower,"có:",count1)
print(int,"có:",count2)