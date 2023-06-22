class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<goal.length; i++) {
            if(c1 < cards1.length && cards1[c1].equals(goal[i])) {
                c1 += 1;
                continue;
            }
            if(c2 < cards2.length && cards2[c2].equals(goal[i])) {
                c2 += 1;
                continue;
            }
            return "No";
        }
        
        return "Yes";
    }
}