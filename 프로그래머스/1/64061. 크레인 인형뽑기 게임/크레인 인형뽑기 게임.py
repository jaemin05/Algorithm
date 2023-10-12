def solution(board, moves):
    stack = []
    cnt = 0
    
    for i in moves: # moves에서 하나 씩 값을 빼고
        for j in range(len(board)): # 위에서 아래로 돌면서
            if board[j][i-1] != 0: # 0이 아닐 때
                stack.append(board[j][i-1]) # 해당 값을 스택에 추가
                board[j][i-1] = 0 # 0으로 변경
                
                if len(stack) > 1: # 스택에 값이 2개 이상일 때
                    if stack[-1] == stack[-2]:
                        stack.pop()
                        stack.pop()
                        cnt += 2
                break
    return cnt