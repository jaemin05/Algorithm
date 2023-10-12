def solution(new_id):    
    #1
    new_id = new_id.lower()
    arr = ''
    
    #2
    for word in new_id:
        if word.isalnum() or word in '-_.':
            arr += word
    #3
    while '..' in arr:
        arr = arr.replace('..', '.')
    #4
    if len(arr) >= 1:
        if arr[0] == '.':
            arr = arr[1:]
    if len(arr) >= 1: 
        if arr[-1] == '.':
            arr = arr[:-1]
    #5
    if arr == '':
        arr = "a"
    #6
    if len(arr) > 15:
        arr = arr[:15]
        if arr[-1] == '.':
            arr = arr[:-1]
    #7
    if len(arr) <= 3:
        arr = arr + arr[-1] * (3-len(arr))
        
    return arr