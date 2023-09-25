num = input()
c = [0] * 10

for i in range(len(num)):
    a = int(num[i])
    if a == 6 or a == 9:
        if c[6] < c[9]:
            c[6] += 1
        else:
            c[9] += 1
    else :
        c[a] += 1
print(max(c))