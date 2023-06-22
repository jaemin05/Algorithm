import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            int j=moves[i]-1;
            for (int k=0;k<board.length; k++){
                if(board[k][j] != 0) {
                    stack.push(board[k][j]);
                    board[k][j] = 0;
                    int stack_size = stack.size();
                    if(stack_size > 1 && stack.peek() == stack.get(stack_size-2)){
                        stack.pop();
                        stack.pop();
                        answer += 2;
                    }
                    break;
                    
                }
            }
        }
        
        
        return answer;
    }
}