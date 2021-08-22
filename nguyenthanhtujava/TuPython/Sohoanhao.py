import array as arr
a = arr.array('i',[23,496,32,6,34,28])

for i in a:
    x=0
    for j in range (1,i):
        if i%j==0:
            x+=j
    if x == i:
        print (x,"là số hoàn hảo!")
else:
    print("Còn lại không phải số hoàn hảo!")