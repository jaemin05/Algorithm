class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int answer = 1;
        
        for(int sect : section) {
            if(sect >= start && sect <= end) {
                continue;
            } else {
                start = sect;
                end = sect + (m - 1);
                answer+=1;
            }
        }
        return answer;
    }
}