import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] int1 = new int[10];
        int[] int2 = new int[10];
        
        for(String i : X.split("")) {
            int1[Integer.parseInt(i)]++;
        }
        
        for(String j : Y.split("")) {
            int2[Integer.parseInt(j)]++;
        }
        
        for(int i = 9; i>=0; i--) {
            while(int1[i] > 0 && int2[i] > 0) {
                sb.append(i);
                int1[i]--;
                int2[i]--;
            }
        }
        
        if(sb.toString().equals("")) return "-1";
        if(sb.toString().substring(0,1).equals("0")) return "0";
        
        return sb.toString();
    }
}