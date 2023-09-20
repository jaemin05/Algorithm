num = int(input())
result = 0
stack = []

for _ in range(num):
    i = int(input())
    if i != 0:
        stack.append(i)
    else:
        stack.pop()

print(sum(stack))