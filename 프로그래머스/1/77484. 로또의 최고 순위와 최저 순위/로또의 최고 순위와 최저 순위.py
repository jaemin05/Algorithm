def rank(num):
    if num > 1:
        return 7 - num
    else:
        return 6

def solution(lottos, win_nums): # [31, 10, 45, 1, 6, 19]
    cnt = 0
    zero = 0
    
    for i in lottos: # [44, 1, 0, 0, 31, 25]	
        if i in win_nums: # win_nums 안에 포함된 경우
            cnt += 1 
        elif i == 0:
            zero += 1
    # 최고
    max = rank(cnt + zero)
    # 최저 
    min = rank(cnt)
        
    return [max, min]