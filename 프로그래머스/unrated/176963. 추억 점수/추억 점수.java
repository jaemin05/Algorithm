import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map1 = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            map1.put(name[i], yearning[i]);
        }

        int i=0;
        for(String[] ph : photo) {
            for(String p : ph) {
                if(map1.get(p) != null) {
                    answer[i] += map1.get(p).intValue();
                }
            }
            i++;
        }
        
        return answer;
    }
}