import sys
def isInt(numStr):
    try:
        int(numStr)
        return True
    except ValueError:
        return False
        
def inputlist():
    list=[]
    while True:
        num = input("Nhap so nguyen: ")
        if num == 'e': break
        if isInt(num): list.append(int(num))
        else: print("Loi! vui long nhap lai.")
    return list
list = inputlist()
def max(list):
    x = 0
    for i in list:
        if i > x:
            x = i
    return x
def min(list):
    for j in list:
        y = j
        if j < y:
            y = j
    return y
print(max(list),"la so lon nhat")
print(min(list),"la so nho nhat")