import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            stack.push(arr[i]);
            int stack_size = stack.size();
            if(stack_size > 1 && stack.peek() == stack.get(stack_size - 2)) {
                stack.pop();
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int j = 0; j < stack.size(); j++) {
            answer[j] = stack.get(j);
        }

        return answer;
    }
}