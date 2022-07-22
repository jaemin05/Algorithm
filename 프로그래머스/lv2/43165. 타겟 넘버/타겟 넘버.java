class Solution {
    
    int result = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, 0, target);
        return result;
    }
    
    public void dfs(int i, int[] numbers, int sum, int target) {
        
        if(i == numbers.length) {
            result += (target == sum ? 1:0);
            return;
        }
        
        dfs(i+1, numbers, sum + numbers[i], target);
        dfs(i+1, numbers, sum - numbers[i], target);
    }
}