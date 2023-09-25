import sys
input = sys.stdin.readline

word =  list(input().rstrip())
i = 0
start = 0

while i < len(word):
    if word[i] == '<':
        i+=1
        while word[i] != '>':
            i+=1
        i+=1
    elif word[i].isalnum():
        start = i
        while i < len(word) and word[i].isalnum():
            i += 1
        tmp = word[start:i]
        tmp.reverse()
        word[start:i] = tmp
    else: 
        i += 1
print("".join(word))