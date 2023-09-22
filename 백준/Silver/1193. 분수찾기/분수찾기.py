input = int(input())
line = 1

while input>line:
    input-=line
    line+=1

if line % 2 == 0:
    a = input
    b = line-input+1
else:
    a = line-input+1
    b = input
print(a, '/', b, sep='')