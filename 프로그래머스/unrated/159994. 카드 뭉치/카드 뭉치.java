class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        int aa = cards1.length;
        int bb = cards2.length;

        for (int i = 0; i < goal.length; i++) {
            String c = goal[i];

            if(a < aa && cards1[a].equals(c)) {
                a++;
            } else if (b < bb && cards2[b].equals(c)) {
                b++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}