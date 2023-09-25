n1, n2 = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n1)]
c1 = int(input())

for _ in range(c1):
    i, j, x, y = map(int, input().split())
    cnt = 0
    for a in range(i-1, x):
        for b in range(j-1, y):
            cnt += arr[a][b]
    print(cnt)

        
