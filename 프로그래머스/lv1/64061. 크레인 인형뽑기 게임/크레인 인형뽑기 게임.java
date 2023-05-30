import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stac = new Stack<>();
        stac.push(0);
        
        for(int move : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][move-1] != 0) {
                    if(stac.peek() == board[i][move-1]) {
                        answer += 2;
                        stac.pop();
                    }
                    else {
                    stac.push(board[i][move-1]);
                }
                    board[i][move-1] = 0;
                break;
                } 
                
            }
        }
        
        return answer;
    }
}