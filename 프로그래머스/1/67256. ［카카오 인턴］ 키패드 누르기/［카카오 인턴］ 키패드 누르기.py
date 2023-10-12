def solution(numbers, hand):
    num = {
           1: [0,0], 2: [0,1], 3: [0,2],
           4: [1,0], 5: [1,1], 6: [1,2],
           7: [2,0], 8: [2,1], 9: [2,2],
           '*': [3,0], 0: [3,1], '#': [3,2] 
    }
    
    result = ''
    left = num['*']
    right = num['#']
    
    for i in numbers:
        now = num[i]
        if i in [1, 4, 7]:
            left = now
            result += 'L'
        elif i in [3, 6, 9]:
            right = now
            result += 'R'
        else:
            ll = 0
            rr = 0
            
            for x,y,z in zip(left, right, now):
                ll += abs(x-z)
                rr += abs(y-z)
                
            if ll > rr:
                right = now
                result += 'R'
            elif ll < rr: 
                left = now
                result += 'L'
            else: 
                if hand == "right":
                    right = now
                    result += 'R'
                else:
                    left = now
                    result += 'L'
    return result            
            
            