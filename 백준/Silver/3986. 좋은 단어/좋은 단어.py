import sys
input = sys.stdin.readline

a = int(input())
b = 0

for _ in range(a):
    c = []
    d = input().rstrip()
    for e in range(len(d)):
        if c and d[e] == c[-1]:
            c.pop()
        else:
            c.append(d[e])
    if not c:
        b += 1

print(b)