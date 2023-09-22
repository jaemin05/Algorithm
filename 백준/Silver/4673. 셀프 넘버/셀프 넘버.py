arr = []


for i in range(1, 10001):
    if i not in arr:
        print(i)
    
    nstr = str(i)
    sum_str = i

    for d in nstr:
        sum_str += int(d)

    arr.append(sum_str)
