num = int(input())
cnt = 0

for _ in range(num):
    arr = input()
    bow = []
    if len(arr) == 1: # 단어가 한 자리이면 그룹 단어
        cnt += 1
    else:
        for i in range(len(arr)):
            if i == 0: 
                bow.append(arr[i])
            else:
                if arr[i] == arr[i-1]:
                     if i == len(arr) - 1:
                         cnt+=1
                     bow.append(arr[i])
                else:
                    if arr[i] not in bow:
                        if i == len(arr)-1:
                            cnt += 1
                        else:
                            bow.append(arr[i])
                    else:
                        break

print(cnt)