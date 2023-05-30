import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String key : keymap) {
            String[] s = key.split("");
            for(int i=0; i<s.length; i++) {
                if(map.containsKey(s[i])) {
                    if(map.get(s[i]) > i + 1) {
                        map.replace(s[i], i + 1);
                    }
                } else {
                    map.put(s[i], i + 1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++) {
            String[] t = targets[i].split("");
            for(String tt : t) {
                if(map.containsKey(tt)) {
                    answer[i] += map.get(tt);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }      
        return answer;
    }
}