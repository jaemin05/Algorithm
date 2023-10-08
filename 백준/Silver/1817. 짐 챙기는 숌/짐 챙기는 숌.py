import sys
input = sys.stdin.readline

n, m = map(int, input().split())
w = list(map(int, input().split()))
c = 0
r = 1

if n == 0:
    print(0)
    exit()

for i in w:
    if i + c > m:
        r += 1
        c = i
    else:
        c += i
print(r)