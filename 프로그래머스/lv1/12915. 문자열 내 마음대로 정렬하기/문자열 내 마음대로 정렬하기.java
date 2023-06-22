import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++) {
            list.add("" + strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        String[] str = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            str[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return str;
    }
}