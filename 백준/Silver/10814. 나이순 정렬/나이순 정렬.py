import sys
input = sys.stdin.readline

num = int(input())
arr = []
for i in range(num):
    a, n = map(str, input().split())
    arr.append((int(a), i ,n))

arr = sorted(arr)

for i in range(num):
    print(arr[i][0], end=" ")
    print(arr[i][2])