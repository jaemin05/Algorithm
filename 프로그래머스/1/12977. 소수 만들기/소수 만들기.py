from itertools import combinations
import math

def is_prime(num):
    for i in range(2, int(math.sqrt(num))+1):
        if num % i == 0:
            return False
    return True
    
def solution(nums):
    answer = 0
    for i in combinations(nums, 3):
        if is_prime(sum(i)):
            answer += 1
    return answer
    