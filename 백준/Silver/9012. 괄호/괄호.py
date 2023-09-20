num = int(input())

for _ in range(num):
    stack = []
    n = input()
    for i in range(len(n)):
        if n[i] == '(':
            stack.append(n[i])
        else:
            if not stack:
                print("NO")
                break
            else:
                stack.pop()
    else:
        if not stack:
            print("YES")
        else:
            print("NO")