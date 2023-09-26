import sys
input = sys.stdin.readline

num = int(input())
arr = []
result = []

for i in range(1, num+1):
    arr.append(i)

while len(arr) > 1:
    result.append(arr.pop(0))
    p1 = arr.pop(0)
    arr.append(p1)
    
result.append(arr[0])
print(*result)