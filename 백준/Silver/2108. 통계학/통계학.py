import sys
input=sys.stdin.readline

num = int(input())
arr = []

for _ in range(num):
    arr.append(int(input()))
    
arr.sort()

print(round(sum(arr)/len(arr)))
print(arr[len(arr)//2]) 

dic= dict()
for i in arr:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

mx = max(dic.values())
ma = []

for i in dic:
    if mx == dic[i]:
        ma.append(i)

if len(ma) > 1:
    print(ma[1])
else:
    print(ma[0])

print(max(arr)-min(arr)) #범위